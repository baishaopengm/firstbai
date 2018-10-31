package com.soft.road.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 * @program: SpringMVCHelloWorld
 * @description: 控制拦截器
 * @author: baisp
 * @create: 2018-09-17 23:37
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping("/")
     public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
           return modelAndView;
     }
}
