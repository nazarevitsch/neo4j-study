package com.study.neo4j.dto;

import lombok.Data;

@Data
public class PersonDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
