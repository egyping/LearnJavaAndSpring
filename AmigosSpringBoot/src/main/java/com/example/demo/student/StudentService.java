package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


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


    // addNewStudent check first if the email exist or not if exist return error if not save
    //
    public void addNewStudent(Student student) {
        // lets first print the student came from the request
        //system.out.println(student);

        // Check if the email exist return exception if not add new student
        // using the optional class at the repository
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("email exist");
        }
        studentRepository.save(student);
    }
}
