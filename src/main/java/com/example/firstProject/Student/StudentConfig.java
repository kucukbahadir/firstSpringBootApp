package com.example.firstProject.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student bahadir = new Student(
                    "Bahadir",
                    "munisebahadir@gmail.com",
                    LocalDate.of(1995, 1, 9)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1997, 1, 9)
            );
            repository.saveAll(List.of(bahadir,alex));
        };
    }
}
