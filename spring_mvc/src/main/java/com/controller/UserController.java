package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = "/quick1")
    public String save1(){
        System.out.println("UserController running...");
        return "success.jsp";
    }

    @RequestMapping(value = "/quick")//method = RequestMethod.GET,params = {"username"}
    public String save(){
        System.out.println("UserController running...");
        return "success.jsp";
    }
}
