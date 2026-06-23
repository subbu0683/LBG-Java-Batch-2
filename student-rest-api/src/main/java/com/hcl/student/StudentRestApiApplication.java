package com.hcl.student;

import com.hcl.student.pojo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRestApiApplication {

	public static void main(String[] args) {
		System.out.println("Hello World! This is a Spring Boot application for Student REST API.");
		SpringApplication.run(StudentRestApiApplication.class, args);
	}

}
