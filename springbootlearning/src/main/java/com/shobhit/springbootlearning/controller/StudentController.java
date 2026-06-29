package com.shobhit.springbootlearning.controller;

import com.shobhit.springbootlearning.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student){

        String message = "Student added: " + student.getName() + ", email: " + student.getEmail() + ", Age: " + student.getAge();

        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }

    @GetMapping("/find/{name}")
    public ResponseEntity<String> findStudent(@PathVariable String name){
        if(name.equals("Shobhit")){
            return ResponseEntity.status(HttpStatus.OK).body("Found Student: " + name);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found: "+name);
    }
}
