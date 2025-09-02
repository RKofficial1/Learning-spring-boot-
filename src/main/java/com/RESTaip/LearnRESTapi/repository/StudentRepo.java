package com.RESTaip.LearnRESTapi.repository;

import com.RESTaip.LearnRESTapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,> {
}
