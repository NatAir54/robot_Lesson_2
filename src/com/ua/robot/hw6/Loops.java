package com.ua.robot.hw6;

public class Loops {
    public static void main(String[] args) {
        // print 1 to 10 numbers
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // get all even numbers from 1 to 100
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // calculate factorial of 7
        System.out.println(factorial(7));

        // Print Fibonacci numbers up to 100 (the value of the number itself must not exceed 100)
        fibonacciUpTo(100);

    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void fibonacciUpTo(int number) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; ; ++i) {
            int next = a + b;
            a = b;
            b = next;
            if (next > number) {
                break;
            }
            System.out.print(next + " ");
        }
    }


}
