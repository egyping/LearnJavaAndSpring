package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


// Long since the Student primary key is ID is Long type
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // find user by email

    Optional<Student> findStudentByEmail(String email);
}
