package com.ua.robot.hw22;

import java.util.Comparator;
import java.util.Objects;

public class Student {
    private String lastName;
    private double averageGrade;

    public Student(String lastName, double averageGrade) {
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return averageGrade == student.averageGrade && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, averageGrade);
    }

    @Override
    public String toString() {
        return lastName + ", average grade = " + averageGrade;
    }
}

class ComparatorByLastName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

class ComparatorByAverageGrade implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageGrade() > o2.getAverageGrade()) {
            return -1;
        } else if (o1.getAverageGrade() < o2.getAverageGrade()) {
            return 1;
        }
        return 0;
    }
}
