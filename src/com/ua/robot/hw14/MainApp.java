package com.ua.robot.hw14;

public class MainApp {
    public static void main(String[] args) {
        Person[] personArray = {new Student("Henry", "Lewis", 19, 1001, "Computer Science"),
                new Student("Ben", "Miller", 20, 1002, "Computer Science"),
                new Student("Arabella", "Clark", 19, 1003, "Computer Science"),
                new Teacher("Andrew", "Lewis", 39, "Mathematics"),
                new Teacher("Barry", "Rainbow", 30, "Physical culture"),
                new Teacher("Natalie", "Crawl", 29, "English")};

        for (Person obj : personArray) {
            System.out.println(obj.display() + " ");
            obj.relax();
        }
    }
}
