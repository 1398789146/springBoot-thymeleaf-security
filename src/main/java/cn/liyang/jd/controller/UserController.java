package cn.liyang.jd.controller;

import cn.liyang.jd.mapper.UserMapper;
import cn.liyang.jd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liyang
 * @date 2019/9/5 15:20
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/lg")
    public ModelAndView login (User user) {
        ModelAndView mv = new ModelAndView();
        User message = userMapper.findByNameAndPassword( user );
        System.out.println(message);
        if (message == null) {
            mv.setViewName( "login" );
            mv.addObject( "message", "用户名或者密码错误" );
            return mv;
        }
       mv.setViewName( "admin/success" );
        return mv;
    }
}
