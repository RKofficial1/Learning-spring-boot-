package com.RESTaip.LearnRESTapi.service.impl;

import com.RESTaip.LearnRESTapi.DTO.StudentDto;
import com.RESTaip.LearnRESTapi.entity.Student;
import com.RESTaip.LearnRESTapi.repository.StudentRepo;
import com.RESTaip.LearnRESTapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;


    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> studentList = studentRepo.findAll();
        return studentList
                .stream()
                .map(student -> new StudentDto(student.getEmail(), student.getName(),student.getId()))
                .toList();
    }

    @Override
    public void addStudent(String name, String mail) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(mail);
        studentRepo.save(student);
    }

    @Override
    public void deleteByName(Long id) {
        studentRepo.deleteById(id);
    }

}
