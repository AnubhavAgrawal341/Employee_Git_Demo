package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //componentscan(com.example.demo)
public class EmployeeManagementApplication {
	
	public static void main(String[] args) {
		System.out.println("first line in sts after git ");
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
