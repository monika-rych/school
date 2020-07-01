package com.rych.school.repository;

import com.rych.school.domain.Address;
import com.rych.school.domain.School;
import com.rych.school.domain.SchoolClass;
import com.rych.school.domain.Student;
import com.rych.school.repository.api.SchoolRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchoolRepositoryImpl implements SchoolRepository {

    List<School> schools = new ArrayList<>();
    List<Address> addresses = new ArrayList<>();

    public SchoolRepositoryImpl() {

        Address address1 = new Address("1", "Wiertnicza", 67, 28, "Poznan");
        Student student1 = new Student("1", "Dawid", LocalDate.of(1988, 2, 17), address1);
        Address address2 = new Address("2", "Mlodosci", 41, 17, "Warszawa");
        Student student2 = new Student("2", "Ola", LocalDate.of(1900, 11, 22), address2);
        Address address3 = new Address("3", "Wiertnicza", 89, 28, "Poznan");
        Student student3 = new Student("3", "Piotr", LocalDate.of(1970, 12, 23), address3);
        Address address4 = new Address("4", "Wiertnicza", 89, 28, "Poznan");
        Student student4 = new Student("4", "Damian", LocalDate.of(1980, 1, 29), address4);
        Set<Student> students1 = new HashSet<>();
        students1.add(student1);
        students1.add(student2);

        Set<Student> students2 = new HashSet<>();
        students2.add(student3);
        students2.add(student4);

        SchoolClass schoolClass11 = new SchoolClass("1", "1A", students1);
        SchoolClass schoolClass12 = new SchoolClass("2", "3D", students2);

        Set<SchoolClass> classes1 = new HashSet<>();
        classes1.add(schoolClass11);
        classes1.add(schoolClass12);

        School school1 = new School("1", "Mikolaja Reja", address1, classes1);


        Address address5 = new Address("5", "Polna", 76, 28, "Lublin");
        Student student5 = new Student("5", "Iwona", LocalDate.of(1978, 2, 25), address5);
        Address address6 = new Address("6", "Wolnosci", 401, 17, "Opole");
        Student student6 = new Student("6", "Jola", LocalDate.of(1940, 9, 12), address6);
        Address address7 = new Address("7", "Kwiatowa", 81, 28, "Lubartow");
        Student student7 = new Student("7", "Matylda", LocalDate.of(1950, 10, 10), address7);
        Address address8 = new Address("8", "Sucha", 76, 68, "Rzeszow");
        Student student8 = new Student("8", "Magda", LocalDate.of(1980, 1, 9), address8);
        Set<Student> students3 = new HashSet<>();
        students3.add(student5);
        students3.add(student6);

        Set<Student> students4 = new HashSet<>();
        students4.add(student7);
        students4.add(student8);

        SchoolClass schoolClass13 = new SchoolClass("1", "1A", students1);
        SchoolClass schoolClass14 = new SchoolClass("2", "3D", students2);

        Set<SchoolClass> classes2 = new HashSet<>();
        classes2.add(schoolClass13);
        classes2.add(schoolClass14);


        School school2 = new School("2", "Zespol Szkol Nr3", address2, classes2);

        schools.add(school1);
        schools.add(school2);

        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        addresses.add(address4);
        addresses.add(address5);
        addresses.add(address6);
        addresses.add(address7);
        addresses.add(address8);

    }

    @Override
    public List<School> getAll() {
        return schools;
    }

    @Override
    public List<Address> getAllStudentsAddresses() {
        return addresses;
    }
}
