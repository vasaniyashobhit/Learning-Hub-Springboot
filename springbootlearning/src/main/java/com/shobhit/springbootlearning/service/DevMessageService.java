package com.shobhit.springbootlearning.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevMessageService implements MessageService{

    @Override
    public String getMessage(){
        return "Dev mode: hello from development server";
    }

}
