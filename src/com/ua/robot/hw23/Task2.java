package com.ua.robot.hw23;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Task2 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(1, 11));
        }
        System.out.println("List of random integers from 0 till 10: " + randomList);

        Stream<Integer> stream = randomList.stream();
        Optional<Integer> sum = stream.reduce((x, y) -> x + y);
        System.out.println("Sum of list elements: " + sum.get());
    }
}
