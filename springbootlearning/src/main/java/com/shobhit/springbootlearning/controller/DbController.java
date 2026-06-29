package com.shobhit.springbootlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @Autowired
    String database;

    @GetMapping("/db")
    public String getDb(){
        return "Connected to: " + database;
    }
}
