package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
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

    // using a database \\

    // studentRepository ref type variable to be used in my code
    // studentRepository created from class extend the JpaRepository which deal with the DB
    private final StudentRepository studentRepository;

    // Constructor autowired to the repo interface
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    // Get service to list all students
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }


    // addNewStudent check first if the email exist or not if exist return error if not save
    @Transactional
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

    public void deleteStudent(Long studentId) {
        boolean existsBoolean = studentRepository.existsById(studentId);
        if (!existsBoolean) {
            throw new IllegalStateException(
             "User is not exist"
            );
        }
        studentRepository.deleteById(studentId);
    }

    // Update student
    // using the Transactional annotation avoided us from using any query at the Repository
    // we are directly dealing with the class like normal java application
    @Transactional
    public void updateStudent(
            Long studentId,
            String name,
            String email) {
        Student studentFiltered  = studentRepository.findById(studentId).orElseThrow(
                ()-> new IllegalStateException("User not found")
        );
        if (name != null && name.length() > 0 && !Objects.equals(studentFiltered.getName(), name)){
            studentFiltered.setName(name);
        }
        if (email != null && email.length() > 0 && !Objects.equals(studentFiltered.getEmail(), email)){
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(studentFiltered.getEmail());
            if (studentOptional.isPresent()){
                throw new IllegalStateException("Email already exist  ");
            }
            studentFiltered.setEmail(email);
        }
    }


    // Update the student using the @Transactional annotation

}
