package com.shobhit.springbootlearning.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class Engine {
    public Engine(){
        System.out.println("Engine been created !!!");
    }

    @PostConstruct
    public void StartEngine(){
        System.out.println("Engine Started--post construct !!!");
    }

    @PreDestroy
    public void stop(){
        System.out.println("Engine stopped--preDestroy !!!");
    }

    public String getStatus(){
        return "Engine is running";
    }

}
