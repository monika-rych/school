package com.rych.school.repository.api;

import com.rych.school.domain.School;

import java.util.List;

public interface SchoolRepository {

    List<School> getAll();
}
