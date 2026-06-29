package com.shobhit.springbootlearning.demo;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car(){
        System.out.println("=== Car bean is created by SPRING! === ");
    }

    public String drive(){
        return "Car is driving";
    }
}
