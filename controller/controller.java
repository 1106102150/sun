package com.sun.controller;

import com.sun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public String login(String uname,String password){
        System.out.println("index");
        System.out.println(userService.selectuser(uname));
        return "index";
    }

}
