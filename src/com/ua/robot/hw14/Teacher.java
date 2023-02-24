package com.ua.robot.hw14;

public class Teacher extends Person{
    private String subject;

    public Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String display() {
        return "\n" + "Teacher: " + fullName + ", age: " + age + "," + " subject: " + subject;
    }

    @Override
    public void relax() {
        System.out.println("I go to pub with other teachers on Friday");
    }

    void teach() {
        System.out.println("I teach " + getSubject());

    }
}
