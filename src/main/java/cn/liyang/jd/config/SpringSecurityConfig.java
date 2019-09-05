package cn.liyang.jd.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		//指定授权规则
		http.authorizeRequests().antMatchers( "/" ).permitAll()
				.antMatchers( "/admin/**" ).hasRole( "admin" )
				.antMatchers( "/user/**" ).hasRole( "user" )
				.antMatchers( "/vip/**" ).hasRole( "vip" );
		//开启自动配置的登录功能
		//loginPage()开启定制登录页面,并再controller中指定跳转的页面
		//"/userlogin"get请求代表请求登录页,post请求代表处理登录
		http.formLogin().loginPage( "/userlogin" );
		//开启自动注销功能,用户注销清空session,并设置退出成功后返回的页面,自定义退出路径
		http.logout().logoutSuccessUrl( "/out" );
		//记住我,关闭浏览后,重新打开不用登录,自定义页面时,设置checkbox 的neme值
		http.rememberMe().rememberMeParameter( "remeber" );
	}

	@Override
	protected void configure (AuthenticationManagerBuilder auth) throws Exception {
		//passwordEncoder设置加密类型,并且登录的时候会对登录密码先进行加密加盐然后再与正确的密码比较
		// new BCryptPasswordEncoder().encode( "admin" )对密码加密
		//设置用户的角色,可以多多个
		auth.inMemoryAuthentication().passwordEncoder( new BCryptPasswordEncoder() )
				.withUser("admin").password( new BCryptPasswordEncoder().encode( "admin" ) ).roles( "admin","vip","user" )
				.and()
				.withUser("vip").password( new BCryptPasswordEncoder().encode( "admin" ) ).roles( "vip","user" )
				.and()
				.withUser("user").password(new BCryptPasswordEncoder().encode( "admin" ) ).roles( "user" );
	}

	
}
