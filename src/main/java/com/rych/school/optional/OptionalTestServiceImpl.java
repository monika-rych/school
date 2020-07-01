//package com.rych.school.optional;
//
//import com.rych.school.domain.School;
//import com.rych.school.optional.api.OptionalTestService;
//
//import java.util.Optional;
//
//
//public class OptionalTestServiceImpl implements OptionalTestService {
//
//
//    @Override
//    public Optional<String> getSchoolStreet(School school) {
//         return Optional.of(school.getAddress().getStreet());
//
//     /*   if (school != null && school.getAddress() != null) {
//            return school.getAddress().getStreet();
//        }
//        return null;*/
//    }
//}
