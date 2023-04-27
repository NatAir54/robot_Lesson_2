package com.ua.robot.hw32;

public class AnotherSimpleThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("AnotherSimpleThread" + " " + i);
        }
    }
}
