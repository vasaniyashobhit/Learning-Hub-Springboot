package com.shobhit.springbootlearning.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
        name = "feature.sms.enabled",
        havingValue = "true",
        matchIfMissing = false
)
public class SmsService {

    public SmsService(){
        System.out.println("SmsService created -- feature is on");
    }

    public String sendSms(String to){
        return "SMS sent to: " + to;
    }
}
