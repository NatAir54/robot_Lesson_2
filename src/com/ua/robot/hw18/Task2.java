package com.ua.robot.hw18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        Collections.addAll(students, new Student("Natalie", 23), new Student("Irina", 25),
                new Student("Tolik", 19), new Student("Sergey", 20));
        System.out.println(students);
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student {" + "name: " + name + ", age = " + age + '}';
    }
}
