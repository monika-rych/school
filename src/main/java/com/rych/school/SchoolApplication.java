package com.rych.school;

import com.rych.school.service.SchoolServiceImpl;
import com.rych.school.service.api.SchoolService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);

        SchoolService schoolService = new SchoolServiceImpl();
        System.out.println(schoolService.getAllStudents("1"));

    }



}
