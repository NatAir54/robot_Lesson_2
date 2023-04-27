package com.ua.robot.hw32;

public class SimpleThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("SimpleThread" + " " + i);
        }
    }
}
