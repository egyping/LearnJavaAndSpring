package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


// @Component or @Service create BEAN which accept the auto wire request to the class
// Bean is lines of codes tagged by @Service to be used anywhere in the application
// @Component
@Service
public class StudentService {

    // Represent the business logic of your application
    // getStudents is a method to generate new student object

    // List array without DB
//    public List<Student> getStudents(){
//        return List.of(
//                new Student(
//                        "Yassin",
//                        "yassin@gmail.com",
//                        LocalDate.of(2012, Month.APRIL, 3),
//                        10
//
//                )
//        );
//    }

    // using a database

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }


}
