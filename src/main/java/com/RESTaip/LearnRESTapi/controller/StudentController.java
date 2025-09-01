package com.RESTaip.LearnRESTapi.controller;

import com.RESTaip.LearnRESTapi.DTO.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto("a","c",28);
    }
}
