package com.ua.robot.hw38;

@Table(title = "students")
public class Student {
    @Column
    int id;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    int age;

    public Student(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
