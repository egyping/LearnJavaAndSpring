package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // Auto wire will inject the studentService to StudentSertvice bean\component
    // Auto wire will crete new object automatically and link the object to the class
    // Autowire <> studentService <> Component-Bean
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    @GetMapping
    public List<Student> getStudents() {

        return studentService.getStudents();
    }

    // POST will take student data from the request and use addNewStudent to add new student
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){

        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
                 studentService.updateStudent(studentId, name, email);
    }
}



