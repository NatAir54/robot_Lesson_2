package com.ua.robot.hw34;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {
    private static Random random = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (ExecutorService executor = Executors.newFixedThreadPool(10)) {
            List<Future<String>> list = new ArrayList<>();
            Callable<String> callable = new MyCallable();

            for (int i = 0; i < 50; i++) {
                Future<String> future = executor.submit(callable);
                list.add(future);
            }

            for (Future<String> future : list) {
                try {
                    System.out.println(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }

            executor.shutdown();
        }
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return random.nextInt(1, 51) + " " + Thread.currentThread().getName();
    }
}


