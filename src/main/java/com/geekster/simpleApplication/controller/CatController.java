package com.geekster.simpleApplication.controller;

import com.geekster.simpleApplication.model.Student;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @GetMapping(value="/cat")
    public String getCatInfo(){
        return "this is the information about cat";
    }

    @PostMapping(value="/cat")
    public String saveCat(@RequestBody Student studentObj){
        int studentId=studentObj.getStudentId();
        String firstName = studentObj.getFirstName();
        String lastName = studentObj.getLastName();

        System.out.println(studentId+"  "+firstName+"  "+lastName+"  ");
        return "saved -"+studentObj;
    }


}
