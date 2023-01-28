package com.testproject.springboot;

import com.testproject.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
@ComponentScan
public class SpringbootFirstAppApplication {
	public static void main(String[] args) {

		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
