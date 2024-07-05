package com.suranga.spring_boot_tutorial_1.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {




    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student Suranga = new Student(
              1L,
              "Suranga",
              "suranga@email.com",
              LocalDate.of(1997, Month.JULY,5),
              27
            );

            Student Sandaruwan = new Student(
                    1L,
                    "Sandaruwan",
                    "sandaruwan@email.com",
                    LocalDate.of(1987, Month.JULY,5),
                    28
            );

            repository.saveAll(
                    List.of(Suranga, Sandaruwan)
            );
        };
    }
}


