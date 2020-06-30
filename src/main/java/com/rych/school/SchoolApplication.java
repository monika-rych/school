package com.rych.school;

import com.rych.school.repository.SchoolRepositoryImpl;
import com.rych.school.repository.api.SchoolRepository;
import com.rych.school.service.SchoolServiceImpl;
import com.rych.school.service.api.SchoolService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);

        SchoolRepository schoolRepository = new SchoolRepositoryImpl();
        SchoolService schoolService = new SchoolServiceImpl(schoolRepository);
        System.out.println(schoolService.getAllStudents("1"));

    }



}
