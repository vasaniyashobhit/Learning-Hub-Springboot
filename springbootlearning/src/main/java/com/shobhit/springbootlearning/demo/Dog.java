package com.shobhit.springbootlearning.demo;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public Dog(){
        System.out.println("Dog created at the start");
    }
}
