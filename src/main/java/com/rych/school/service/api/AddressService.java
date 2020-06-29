package com.rych.school.service.api;

import java.util.Map;

public interface AddressService {

    Map<String, Long> getCountOfStudentsInClasses(String schoolId);

}
