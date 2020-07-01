package com.rych.school.optional.api;

import com.rych.school.domain.School;

import java.util.Optional;

public interface OptionalTestService {

    Optional<String> getSchoolStreet(School school);

}
