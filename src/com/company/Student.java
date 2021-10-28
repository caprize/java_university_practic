package com.company;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    String name;
    Integer id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return id.compareTo(o.id);
    }
}
