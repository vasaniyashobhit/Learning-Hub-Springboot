package com.shobhit.springbootlearning.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DatabaseConfig {

    @Bean
    @Profile("dev")
    public String devDatabase(){
        System.out.println("=== Connectinve to Dev Database (local host) === ");
        return "jdbc:mysql://localhost:3306/dev_db";
    }

    @Bean
    @Profile("prod")
    public String prodDatabase(){
        System.out.println("=== connectring to prod database ===");
        return "jdbc:mysql://aws-rds-server:3306/prod_dp";
    }
}
