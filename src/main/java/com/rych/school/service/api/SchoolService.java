package com.rych.school.service.api;

import com.rych.school.domain.Student;

import java.util.List;

public interface SchoolService {

    List<Student> getAllStudents(String schoolId);

}
