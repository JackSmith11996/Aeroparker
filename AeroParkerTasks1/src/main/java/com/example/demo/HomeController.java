package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;




@Controller
public class HomeController {


    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register.html");
        return modelAndView;
    }

    @PostMapping("/submit")
    public ModelAndView hello() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success.html");
        return modelAndView;

    }
}
