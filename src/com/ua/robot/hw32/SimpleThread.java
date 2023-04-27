package com.ua.robot.hw32;

public class SimpleThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("SimpleThread" + " " + i);
        }
    }
}
