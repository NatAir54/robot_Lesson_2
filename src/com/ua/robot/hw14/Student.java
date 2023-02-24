package com.ua.robot.hw14;

public class Student extends Person{
    private int rollNumber;
    private String course;

    public Student(String firstName, String lastName, int age, int rollNumber, String course) {
        super(firstName, lastName, age);
        this.rollNumber = rollNumber;
        this.course = course;
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
    public String display() {
        return "\n" + "Student: " + fullName + ", age: " + age + "," + " roll number: " + rollNumber + ", course: " + course;
    }

    @Override
    public void relax() {
        System.out.println("I have student party every Friday");
    }

    void study() {
        System.out.println("I study " + getCourse());
    }

}
