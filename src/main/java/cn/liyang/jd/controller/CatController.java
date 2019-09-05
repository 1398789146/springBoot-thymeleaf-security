package cn.liyang.jd.controller;

import cn.liyang.jd.mapper.CatMapper;
import cn.liyang.jd.pojo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author liyang
 * @date 2019/9/5 16:12
 * @description:
 */
@Controller
@RequestMapping("/cat")
public class CatController {
    @Autowired
    CatMapper catMapper;

    @RequestMapping("/findAll")
    public ModelAndView findAll () {
        ModelAndView mv = new ModelAndView();
        List<Cat> list = catMapper.findAll();
        mv.addObject( "list",list );
        mv.setViewName( "success" );
        return  mv;
    }
}
