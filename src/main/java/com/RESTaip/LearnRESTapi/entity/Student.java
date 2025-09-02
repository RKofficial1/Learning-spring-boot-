package com.RESTaip.LearnRESTapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Student{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String USN;
    private String name;
    private String email;
}
