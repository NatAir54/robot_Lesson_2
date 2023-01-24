package com.ua.robot.hw5;

public class MainApp {
    public static void main(String[] args) {
        int a = 859;
        int b = 336;
        System.out.println(maxNumber(a, b));
        System.out.println(minNumber(a, b));
        System.out.println(isEven(a));
        System.out.println(isEven(b));
    }

    public static int maxNumber(int par1, int par2) {
        return Math.max(par1, par2);
    }

    public static int minNumber(int par1, int par2) {
        return Math.min(par1, par2);
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
