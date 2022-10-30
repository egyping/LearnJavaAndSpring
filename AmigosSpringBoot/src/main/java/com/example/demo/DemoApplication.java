package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@GetMapping
//	public String hello(){
//		return "Amigos spring course said hello";
//	}
//	@GetMapping
//	public List<String> hello(){
//		return List.of("Amigos spring course said hello", "World");
//	}
//	@GetMapping
//	public List<Student> hello(){
//		return List.of(
//				new Student(
//						"Yassin",
//						"yassin@gmail.com",
//						LocalDate.of(2012, Month.APRIL, 3),
//						10
//
//				)
//		);
//	}
}
