package com.example.demo.controller;

import com.example.demo.sevice.SeviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
    @Autowired
    SeviceImp seviceImp;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return seviceImp.hello();
    }
}
