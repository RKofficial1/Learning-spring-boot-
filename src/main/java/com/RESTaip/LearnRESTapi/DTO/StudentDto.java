package com.RESTaip.LearnRESTapi.DTO;

import lombok.Data;

@Data
public class StudentDto {
    private long id;
    private String name;
    private  String email;

    public StudentDto(String email, String name, long id) {
        this.email = email;
        this.name = name;
        this.id = id;
    }
}
