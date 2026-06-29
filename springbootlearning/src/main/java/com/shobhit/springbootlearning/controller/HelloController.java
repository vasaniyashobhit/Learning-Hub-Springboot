package com.shobhit.springbootlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello shobhit, this is your first sprint boot";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "bye bye see you later !";
    }
}
