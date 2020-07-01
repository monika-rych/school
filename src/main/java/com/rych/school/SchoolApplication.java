package com.rych.school;

import com.rych.school.domain.School;
import com.rych.school.domain.Student;
import com.rych.school.optional.api.OptionalTestService;
import com.rych.school.repository.SchoolRepositoryImpl;
import com.rych.school.repository.api.SchoolRepository;
import com.rych.school.service.ClassServiceImpl;
import com.rych.school.service.SchoolServiceImpl;
import com.rych.school.service.api.ClassService;
import com.rych.school.service.api.SchoolService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);

        SchoolRepository schoolRepository = new SchoolRepositoryImpl();
        SchoolService schoolService = new SchoolServiceImpl(schoolRepository);
        System.out.println(schoolService.getAllStudents("1"));

        ClassService classService = new ClassServiceImpl(schoolRepository);

        System.out.println("-------------------------------------------");

        Map<String, List<Student>> studentsOfClasses = classService.getStudentsOfClasses("2");
        studentsOfClasses.forEach((className, students) ->{
            System.out.println("Nazwa klasy " + className);
            for (Student student: students){
                System.out.print(student + " ");
            }
            System.out.println();
        } );

        //OptionalTestService optionalTestService = new OptionalTestServiceImpl();

       // School school = new School();
        //System.out.println(optionalTestService.getSchoolStreet(school));

        Map<String, Long> numberOfStudentsOfClasses = classService.getCountOfStudentsInClasses("1");
        numberOfStudentsOfClasses.forEach((className, students) ->{
            System.out.println("Nazwa klasy " + className + " liczba studentow: " + students);
        } );
    }
}
