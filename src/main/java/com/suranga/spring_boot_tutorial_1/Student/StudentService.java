package com.suranga.spring_boot_tutorial_1.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Suranga",
                "suranga@email.com",
                LocalDate.of(1997, Month.JULY, 5),
                27

        ));
    }
}
