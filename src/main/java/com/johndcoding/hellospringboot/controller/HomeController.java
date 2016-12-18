package com.johndcoding.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController  {

    @RequestMapping(path = "/")
    public String home(){
        return "home";
    }

    @RequestMapping(path = "/hello")
    public String hello(@RequestParam(required = false, defaultValue = "Anonymous") String name, Model model){
        model.addAttribute("helloTo", name);
        return "hello";
    }

    @RequestMapping(path = "/helloResponseBody")
    @ResponseBody
    public String sayHello(){
        return "Hello spring!!";
    }


}
