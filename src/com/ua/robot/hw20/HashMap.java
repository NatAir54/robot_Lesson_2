package com.ua.robot.hw20;

import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Translation> hashMap = new java.util.HashMap<>();
        hashMap.put("кіт", new Translation("cat", "猫", "Katze"));
        hashMap.put("собака", new Translation("dog", "犬", "Hund"));
        hashMap.put("щур", new Translation("rat", "ねずみ", "Ratte"));
        hashMap.put("корова", new Translation("cow", "牛", "Kuh"));
        hashMap.put("крокодил", new Translation("crocodile", "クロコダイル", "Krokodil"));
        hashMap.put("слон", new Translation("elephant", "象", "Elefant"));
        hashMap.put("морж", new Translation("walrus", "セイウチ", "Walross"));
        hashMap.put("жабеня", new Translation("frog", "カエル", "Frosch"));
        hashMap.put("бобер", new Translation("beaver", "ビーバー", "Biber"));
        hashMap.put("ведмідь", new Translation("bear", "クマ", "Tragen"));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word for translation please:");
        String in = input.next();
        System.out.println(hashMap.get(in));
    }

}

class Translation {
    String english;
    String japanese;
    String german;

    public Translation(String english, String japanese, String german) {
        this.english = english;
        this.japanese = japanese;
        this.german = german;
    }

    @Override
    public String toString() {
        return "Translation: " +
                "english ='" + english + '\'' +
                ", japanese ='" + japanese + '\'' +
                ", german ='" + german + '\'';
    }
}




