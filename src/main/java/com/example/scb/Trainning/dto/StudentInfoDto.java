package com.example.scb.Trainning.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class StudentInfoDto {
    private Long id;
    private String name;
    private String address;
    private String email;
    private Integer age;
    private Integer partTimeJob;
}
