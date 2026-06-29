package com.shobhit.springbootlearning.controller;

import com.shobhit.springbootlearning.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping("/get")
    public String getVehicle(){
        return vehicleService.getVehicle();
    }

    @GetMapping("/type/{type}")
    public String getType(@PathVariable String type){
        return vehicleService.getVehicleType(type);
    }

}
