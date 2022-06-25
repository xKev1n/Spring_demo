package com.example.demo.Student;

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
            Student miriam = new Student(
                    "Miriam",
                    25,
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "Miriam.jamal@gmail.com,"
            );
            Student kevin = new Student(
                    "Kevin",
                    27,
                    LocalDate.of(1995, Month.JULY, 10),
                    "Kevin@gmail.com,"
            );

            //saving students to the database
            repository.saveAll(List.of(miriam,kevin));
        };
    }
}
