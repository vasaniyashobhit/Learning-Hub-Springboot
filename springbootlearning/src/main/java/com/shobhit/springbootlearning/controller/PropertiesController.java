//package com.shobhit.springbootlearning.controller;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PropertiesController {
//
//    @Value("${app.message}")
//    private String appMessage;
//
//    @Value("${app.name}")
//    private String appName;
//
//    @Value("${app.debug}")
//    private Boolean debug ;
//
//    @GetMapping("/config")
//    public String getConfig(){
//        return appName + " | " + appMessage + " | " + debug;
//    }
//}
