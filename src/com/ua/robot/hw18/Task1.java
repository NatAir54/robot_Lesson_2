package com.ua.robot.hw18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(createTenIntegersList());
        System.out.println(createTwoMillionIntegersList());
    }

    private static List<Integer> createTenIntegersList() {
        List<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return arrayList;
    }

    private static List<Integer> createTwoMillionIntegersList() {
        List<Integer> arrayList = new ArrayList<>(2000000);
        for(int i = 1; i < 2000001; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
}
