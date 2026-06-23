package com.hcl.student.pojo;

import lombok.Data;

@Data
public class Student {
    private Long id;
    private String name;
    private String email;
    private int age;
}
