package com.ua.robot.hw10;

public class Teacher {
    private final String firstName;
    private final String lastName;
    private final String fullName;
    private int age;
    private String subject;

    public Teacher(String firstName, String lastName, int age, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        fullName = firstName + " " + lastName;
        this.age = age;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "\n" + "Teacher: " + fullName + ", age: " + age + "," + " subject: " + subject;
    }
}
