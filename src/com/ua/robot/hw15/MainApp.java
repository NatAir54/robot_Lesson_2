package com.ua.robot.hw15;

public class MainApp {
    public static void main(String[] args) {
        Flying objectFirst = new Pilot("Peter", 28);
        Driving objectSecond = new Driver("Max", 22);

        objectFirst.fly();
        objectSecond.drive();

        Human[] guys = {new Pilot("Sam", 31), new Driver("Derek", 34)};
        for (Human guy: guys) {
            guy.work();
        }
    }
}
