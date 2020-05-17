package org.byron4j.controller;

import org.byron4j.model.User;
import org.byron4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/queryById/{id}")
    public ModelAndView queryById(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("queryById");

        // 调用业务层
        User user = userService.queryById(id);
        // 处理结果
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
