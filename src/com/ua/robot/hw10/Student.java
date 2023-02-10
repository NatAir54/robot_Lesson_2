package com.ua.robot.hw10;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String fullName;
    private int age;
    private int rollNumber;
    private String course;

    public Student(String firstName, String lastName, int age, int rollNumber, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        fullName = firstName + " " + lastName;
        this.age = age;
        this.rollNumber = rollNumber;
        this.course = course;
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

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "\n" + "Student: " + fullName + ", age: " + age + "," + " roll number: " + rollNumber + ", course: " + course;
    }
}
