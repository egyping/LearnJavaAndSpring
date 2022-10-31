package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


// Long since the Student primary key is ID is Long type
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // find user by email
    // using query because @Transactional is not used at the service
    // @Query("SELECT s FROM Student WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
