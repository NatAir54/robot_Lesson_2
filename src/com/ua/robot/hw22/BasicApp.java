package com.ua.robot.hw22;

import java.util.*;


public class BasicApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Washington", 3.0),
                new Student("Arizona", 2.9),
                new Student("Iowa", 3.1),
                new Student("Minnesota", 3.0));

        System.out.println("Original student list: ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        // Basic sort without Lambdas

        System.out.println("Sorting students by last name: ");
        students.sort(new ComparatorByLastName());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Sorting students by average grade (in descending order): ");
        students.sort(new ComparatorByAverageGrade());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}



