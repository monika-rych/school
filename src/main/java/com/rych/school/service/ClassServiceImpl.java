package com.rych.school.service;

import com.rych.school.domain.Address;
import com.rych.school.domain.SchoolClass;
import com.rych.school.domain.Student;
import com.rych.school.repository.api.SchoolRepository;
import com.rych.school.service.api.ClassService;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ClassServiceImpl implements ClassService {

    private SchoolRepository schoolRepository;

    public ClassServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public Map<String, List<Student>> getStudentsOfClasses(String schoolId) {
        Map<String, List<Student>> studentsOfClasses = new HashMap<>();
        schoolRepository.getAll().stream()
                .filter(school -> school.getId().equals(schoolId))
                .map(school -> school.getSchoolClasses())
                .flatMap(Collection::stream)
                .map(schoolClass -> studentsOfClasses.put(schoolClass.getName(), new ArrayList<Student>(schoolClass.getStudents())))
                .collect(Collectors.toList());

        return studentsOfClasses;
    }

    @Override
    public Map<String, Long> getCountOfStudentsInClasses(String schoolId) {
        return null;
    }
}
