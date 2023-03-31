package com.ua.robot.hw23;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("First", "Second", "Third", "Fourth", "Fifth",
                "Sixth", "Seventh", "Eight", "Ninth", "Tenth",
                "First", "Second", "Third", "Fourth", "Fifth",
                "Sixth", "Seventh", "Eight", "Ninth", "Tenth");
        Map<String, Integer> map = new LinkedHashMap<>();

        list.stream()
                .distinct()
                .forEach(s -> map.put(s, count(list, s)));
        System.out.println(map);
    }

    public static int count(List<String> list, String item) {
        return (int) list.stream()
                .filter(s -> s.equals(item))
                .count();
    }
}
