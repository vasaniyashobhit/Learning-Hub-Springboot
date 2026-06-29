package com.shobhit.springbootlearning.controller;

import com.shobhit.springbootlearning.demo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    Cat cat;

    @GetMapping("/test")
    public String test(){
        return "done";
    }
}
