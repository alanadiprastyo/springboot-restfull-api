package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student alan_adi_prastyo = new Student(
                    "Alan Adi Prastyo",
                    "alan.a.prastyo@gmail.com",
                    LocalDate.of(2000, DECEMBER, 5)
            );

            Student adi_prastyo = new Student(
                    "Adi Prastyo",
                    "a.prastyo@gmail.com",
                    LocalDate.of(2001, DECEMBER, 5)
            );

            repository.saveAll(
                    List.of(alan_adi_prastyo, adi_prastyo)
            );

        };
    }
}
