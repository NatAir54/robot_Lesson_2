package com.ua.robot.hw22;

import java.util.Arrays;
import java.util.List;

public class LambdasApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("California", 3.2),
                new Student("Texas", 2.9),
                new Student("Virginia", 3.1),
                new Student("Florida", 3.0));

        System.out.println("Original student list: ");
        students.forEach(s->System.out.println(s));
        System.out.println();

        System.out.println("Sorting students by last name: ");
        students.sort((o1, o2) -> {
            return o1.getLastName().compareTo(o2.getLastName());
        });
        students.forEach(s -> System.out.println(s));
        System.out.println();

        System.out.println("Sorting students by average grade (in descending order): ");
        students.sort((o1, o2) -> {
            if (o1.getAverageGrade() > o2.getAverageGrade()) {
                return -1;
            } else if (o1.getAverageGrade() < o2.getAverageGrade()) {
                return 1;
            }
            return 0;
        });
        students.forEach(s -> System.out.println(s));
    }
}
