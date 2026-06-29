package com.shobhit.springbootlearning.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public String getStudent(){
        return "Shobhit, Age 22";
    }

    public String getTotalStudents(){
        return "Total: 50 students";
    }
}
