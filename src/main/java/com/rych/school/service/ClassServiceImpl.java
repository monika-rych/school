package com.rych.school.service;

import com.rych.school.domain.Student;
import com.rych.school.service.api.ClassService;

import java.util.List;
import java.util.Map;

public class ClassServiceImpl implements ClassService {
    @Override
    public Map<String, List<Student>> getStudentsOfClasses(String schoolId) {
        return null;
    }

    @Override
    public Map<String, Long> getCountOfStudentsInClasses(String schoolId) {
        return null;
    }
}