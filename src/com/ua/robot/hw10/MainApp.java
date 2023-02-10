package com.ua.robot.hw10;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Student[] studentArray = {new Student("Henry", "Lewis", 19, 1001, "Computer Science"),
                new Student("Ben", "Miller", 20, 1002, "Computer Science"),
                new Student("Arabella", "Clark", 19, 1003, "Computer Science")};
        for (Student elem : studentArray) {
            System.out.print(elem + " ");
        }
        System.out.println();

        Teacher[] teacherArray = {new Teacher("Andrew", "Lewis", 39, "Mathematics"),
                new Teacher("Harry", "Rainbow", 30, "Physical culture"),
                new Teacher("Natalie", "Crawl", 29, "English")};
        for (Teacher elem : teacherArray) {
            System.out.print(elem + " ");
        }
        System.out.println("\n");

        int[] arr = NumberArray.createNumberArray(5);
        NumberArray.printOut(arr);
        System.out.println();

        NumberArray.ascendingSorter(arr);
        NumberArray.printOut(arr);
        System.out.println();

        NumberArray.descendingSorter(arr);
        NumberArray.printOut(arr);
    }
}
