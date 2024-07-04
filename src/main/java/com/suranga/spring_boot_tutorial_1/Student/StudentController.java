package com.suranga.spring_boot_tutorial_1.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {


    @GetMapping("/get")
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Suranga", "suranga@email.com", LocalDate.of(1997, Month.JULY, 5), 27

        ));
    }
}
