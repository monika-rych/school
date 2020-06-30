package com.rych.school.service;

import com.rych.school.domain.Address;
import com.rych.school.domain.School;
import com.rych.school.domain.SchoolClass;
import com.rych.school.domain.Student;
import com.rych.school.repository.api.SchoolRepository;
import com.rych.school.service.api.SchoolService;

import java.util.*;
import java.util.stream.Collectors;

public class SchoolServiceImpl implements SchoolService {

    private SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<Student> getAllStudents(String schoolId) {
        return schoolRepository.getAll().stream()
                .filter(school -> school.getId().equals(schoolId))
                .map(school -> school.getSchoolClasses())
                .flatMap(Collection::stream)
                .map(schoolClass -> schoolClass.getStudents())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
