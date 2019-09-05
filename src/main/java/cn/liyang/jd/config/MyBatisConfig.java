package cn.liyang.jd.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author liyang
 * @date 2019/9/5 16:07
 * @description:
 */
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize (Configuration configuration) {
                //开启数据库字段驼峰命名
                configuration.setMapUnderscoreToCamelCase( true );
            }
        };
    }
}
