package com.delete.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }
}
