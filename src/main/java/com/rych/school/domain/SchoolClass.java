package com.rych.school.domain;

import java.util.Set;

public class SchoolClass {

    private String id;
    private String name; //np. 1A, 3B
    private Set<Student> students;

    public SchoolClass(String id, String name, Set<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
