package com.RESTaip.LearnRESTapi.controller;

import com.RESTaip.LearnRESTapi.DTO.StudentDto;
import com.RESTaip.LearnRESTapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDto> getStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{name}/{mail}")
    public List<StudentDto> addStudent(@PathVariable String name, @PathVariable String mail){
        studentService.addStudent(name, mail);
        return studentService.getAllStudents();
    }
    @GetMapping("/students/delete/{id}")
    public List<StudentDto> deleteByName(@PathVariable Long id){
        studentService.deleteByName(id);
        return studentService.getAllStudents();
    }
}
