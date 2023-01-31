package com.ua.robot.hw7;

public class Functions {
    public static void main(String[] args) {
        int x = 11;
        // print cube of the number
        System.out.println(cubedNumber(x));
        System.out.println(cubedNumber(25));

        // print "*" n times
        printSymbol(11);
        printSymbol(x);

        // print my symbol n times
        char a = '@';
        char b = '#';
        printSymbol(a, 13);
        printSymbol(b, x);
        printSymbol('$', 41);
    }

    static int cubedNumber(int number) {
        return number * number * number;
    }

    static void printSymbol(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printSymbol(char c, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
