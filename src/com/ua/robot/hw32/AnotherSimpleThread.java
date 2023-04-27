package com.ua.robot.hw32;

public class AnotherSimpleThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AnotherSimpleThread" + " " + i);
        }
    }
}
