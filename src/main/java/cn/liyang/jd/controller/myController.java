package cn.liyang.jd.controller;

import cn.liyang.jd.pojo.Stu;
import cn.liyang.jd.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liyang
 * @date 2019/9/5 14:09
 * @description:
 */
@Controller
public class myController {
    @Autowired
    private StuService stuService;

    @RequestMapping("/")
    public String shouye(){
        return "home";
    }
    @RequestMapping("/userlogin")
    public String login(){
        return "login";
    }
    @RequestMapping("/out")
    public String logout(){
        return "home";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin/admin";
    }

    @RequestMapping("/user")
    public String user(){
        return "user/user";
    }

    @RequestMapping("/vip")
    public String vip(){
        return "vip/vip";
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Stu> findAll(){
        return stuService.findAll();
    }

}
