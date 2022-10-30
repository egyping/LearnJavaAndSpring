package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                Student yassin = new Student(
                        "Yassin",
                        "yassin@gmail.com",
                        LocalDate.of(2012, Month.APRIL, 3),
                        10
                );
            Student yahya = new Student(
                    "Yahya",
                    "Yahya@gmail.com",
                    LocalDate.of(2016, Month.DECEMBER, 16),
                    6
            );
            repository.saveAll(
                    List.of(yassin, yahya)
            );
        };
    }
}
