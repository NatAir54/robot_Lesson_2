package com.ua.robot.hw10;

import java.util.Random;

public class NumberArray {


    public static int[] createNumberArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static void ascendingSorter(int[] arr) {
        for (int out = arr.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    int temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
    }

    public static void descendingSorter(int[] arr) {
        for (int out = arr.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (arr[in] < arr[in + 1]) {
                    int temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
    }

    static void printOut(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }


}
