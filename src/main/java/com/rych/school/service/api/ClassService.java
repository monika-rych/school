package com.rych.school.service.api;

import com.rych.school.domain.Student;

import java.util.List;
import java.util.Map;

public interface ClassService {

     Map<String, List<Student>> getStudentsOfClasses(String schoolId);

     Map<String, Long> getCountOfStudentsInClasses(String schoolId);

}
