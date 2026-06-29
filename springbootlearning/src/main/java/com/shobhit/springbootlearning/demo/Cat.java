package com.shobhit.springbootlearning.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Cat {
    public Cat(){
        System.out.println("Cat created only when used");
    }
}
