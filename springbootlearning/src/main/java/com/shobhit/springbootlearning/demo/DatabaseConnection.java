package com.shobhit.springbootlearning.demo;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    public DatabaseConnection(){
        System.out.println("Step1: Constructor - Object Created");

    }

    @PostConstruct
    public void openConnection(){
        System.out.println("Step2: PostConstruct - opening DB connection");
    }

    @PreDestroy
    public void closeConnection(){
        System.out.println("Step3: PreDestroy - closing DB connection");

    }
}
