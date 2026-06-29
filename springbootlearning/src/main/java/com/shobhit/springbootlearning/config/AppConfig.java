package com.shobhit.springbootlearning.config;

import com.shobhit.springbootlearning.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User createUserBean(){
        return new User("shobhit", "Shobhit@gmail.com");
    }
}
