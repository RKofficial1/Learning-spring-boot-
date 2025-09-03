package com.RESTaip.LearnRESTapi.service;

import com.RESTaip.LearnRESTapi.DTO.StudentDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface StudentService {
    List<StudentDto> getAllStudents();

    void addStudent(String name, String mail);

    void deleteByName(Long id);
}

