package com.ua.robot.hw5;

public class MainApp {
    public static void main(String[] args) {
        int a = 859;
        int b = 336;
        maxNumber(a, b);
        minNumber(a, b);
        isEven(a);
        isEven(b);
    }

    public static void maxNumber(int par1, int par2) {
        if (par1 == par2) {
            System.out.println("These numbers are equal");
        }
        if (par1 > par2) {
            System.out.println(par1);
        } else {
            System.out.println(par2);
        }
    }

    public static void minNumber(int par1, int par2) {
        if (par1 == par2) {
            System.out.println("These numbers are equal");
        }
        if (par1 < par2) {
            System.out.println(par1);
        } else {
            System.out.println(par2);
        }
    }

    public static void isEven(int x) {
        if (x % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
