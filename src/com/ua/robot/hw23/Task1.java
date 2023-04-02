package com.ua.robot.hw23;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("First", "Second", "Third", "Fourth", "Fifth",
                "Sixth", "Seventh", "Eight", "Ninth", "Tenth",
                "First", "Second", "Third", "Fourth", "Fifth",
                "Sixth", "Seventh", "Eight", "Ninth", "Tenth");

        // first way
        Map<String, Integer> map = new LinkedHashMap<>();
        list.stream()
                .distinct()
                .forEach(s -> map.put(s, count(list, s)));
        System.out.println(map);

        System.out.println();

        // second way
        Map<String, Integer> map2 = list.stream()
                .distinct()
                .collect(Collectors.toMap(s -> s, s -> count(list, s)));
        System.out.println(map2);
    }

    public static int count(List<String> list, String item) {
        return (int) list.stream()
                .filter(s -> s.equals(item))
                .count();
    }
}
