package com.shobhit.springbootlearning.service;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    public String getVehicle(){
        return "Toyota car --- from service layer";
    }

    public String getVehicleType(String type){
        if(type.equals("fast")){
            return "Ferrari";
        }
        return "normal car";
    }
}
