package com.ua.robot.hw19;

import java.util.*;

public class MySet {
    static Random random = new Random();
    public static void main(String[] args) {
        Integer[] array = new Integer[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = random.nextInt(1, 51);
        }
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));
        NavigableSet<Integer> treeSet = new TreeSet<>(Arrays.asList(array));
        System.out.println("HashSet: ");
        System.out.println(hashSet);
        System.out.println("LinkedHashSet: ");
        System.out.println(linkedHashSet);
        System.out.println("TreeSet: ");
        System.out.println(treeSet);
    }
}
