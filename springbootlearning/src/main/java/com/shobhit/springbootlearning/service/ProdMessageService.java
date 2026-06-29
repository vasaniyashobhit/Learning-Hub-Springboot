package com.shobhit.springbootlearning.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdMessageService implements MessageService {

    @Override
    public String getMessage(){
        return "Prod mode: hello from production server !!";
    }

}
