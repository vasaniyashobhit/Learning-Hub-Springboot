package com.shobhit.springbootlearning.controller;

import com.shobhit.springbootlearning.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/calc"))
public class CalculatorController {

    @Autowired
    CalculatorService calculatorservice;

    @GetMapping("/add")
    public String addFunction(
            @RequestParam(name = "a") Integer num1,
            @RequestParam(name = "b") Integer num2
            ){
        return ""+calculatorservice.add(num1,num2);
    }

    @GetMapping("/subtract")
    public String subtractFunction(
            @RequestParam(name = "a") Integer num1,
            @RequestParam(name = "b") Integer num2
    ){
        return ""+calculatorservice.subtract(num1,num2);
    }

    @GetMapping("/multiply")
    public String multipllyFunction(
            @RequestParam(name = "a") Integer num1,
            @RequestParam(name = "b") Integer num2
    ){
        return ""+calculatorservice.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public ResponseEntity<String> divideFunction(
            @RequestParam(name = "a") Integer num1,
            @RequestParam(name = "b") Integer num2
    ){
        if(num2!=0){
            String ans = "" + calculatorservice.divide(num1,num2);
            return ResponseEntity.status(HttpStatus.OK).body(ans);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("cannot divide by zero");
        }
    }

}
