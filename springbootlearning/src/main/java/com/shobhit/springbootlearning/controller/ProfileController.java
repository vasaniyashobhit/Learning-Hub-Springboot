package com.shobhit.springbootlearning.controller;

import com.shobhit.springbootlearning.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    MessageService messageService;

    @GetMapping("/message")
    public String getMessage(){
        return messageService.getMessage();
    }
}
