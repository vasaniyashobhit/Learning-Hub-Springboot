package com.shobhit.springbootlearning.controller;


import com.shobhit.springbootlearning.Entity.UserDetails;
import com.shobhit.springbootlearning.service.UserDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    private final UserDetailService userDetailService;

    public UserController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @GetMapping("/test-jpa")
    public List<UserDetails> testJpa() {
        UserDetails userDetails = new UserDetails(
                "xyx",
                "xyz@conceptandcoding.com",
                28
        );

        userDetailService.saveUser(userDetails);

        return userDetailService.getAllUsers();
    }

}
