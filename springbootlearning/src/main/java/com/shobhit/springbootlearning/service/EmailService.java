package com.shobhit.springbootlearning.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
@ConditionalOnProperty(
        name = "feature.email.enabled",
        havingValue = "true",
        matchIfMissing = false
)
public class EmailService {

    public EmailService(){
        System.out.println("EmailService created -- feature is on");
    }

    public String sendEmail(String to){
        return "Email sent to: " + to;
    }
}
