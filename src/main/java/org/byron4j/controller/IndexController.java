package org.byron4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView dicts(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");  // 指向/WEB-INF/jsp/index.jsp页面
        modelAndView.addObject("now", new Date());
        return modelAndView;
    }
}
