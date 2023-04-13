package com.geekster.simpleApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping(value="/student")
    public String getStudent(){
        return "This is the get mapping";
    }
    @PutMapping(value="/student")
    public String updateStudent() {
        return "This is the put mapping";
    }
    @PostMapping(value="/student")
    public String saveStudent(){
        return "This is the post mapping";
    }
    @DeleteMapping(value="/student")
    public String deleteStudent(){
        return "This is the delete mapping";
    }
}
