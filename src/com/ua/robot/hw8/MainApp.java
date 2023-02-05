package com.ua.robot.hw8;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        // Task 1: create 10 elements array and fill it with random numbers
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(55);
        }
        // Task 2: print the array
        printOut(array);
        System.out.println();

        // Task 3: find the minimum value in the array
        System.out.println("Minimum value in the array: " + getMinValue(array));

        // Task 4: find the maximum value in the array
        System.out.println("Maximum value in the array: " + getMaxValue(array));

        // Task 5: find the average value of the array
        System.out.println("Average value of the array: " + getAverageValue(array));

        // Task 6: find the sum of the array elements
        System.out.println("Sum of the array elements: " + getSum(array));
    }

    static void printOut(int[] arr) {
        for (int elem: arr) {
            System.out.print(elem + "\t");
        }
    }

    static int getMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getAverageValue(int[] arr) {
        int sum = getSum(arr);
        return sum / arr.length;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int elem: arr) {
            sum += elem;
        }
        return sum;
    }
}
