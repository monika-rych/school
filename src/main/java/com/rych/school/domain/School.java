package com.rych.school.domain;

import java.util.Set;

public class School {

    private String id;
    private String name;
    private Address address;
    private Set<SchoolClass> schoolClasses;

    public School(String id, String name, Address address, Set<SchoolClass> schoolClasses) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.schoolClasses = schoolClasses;
    }

    public School() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Set<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    @Override
    public String toString() {
        return "School{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", schoolClasses=" + schoolClasses +
                '}';
    }
}
