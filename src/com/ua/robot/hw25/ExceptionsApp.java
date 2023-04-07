package com.ua.robot.hw25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continueLoop = true;
        do {
            try {
                System.out.println("Please enter an integer number:");
                int number = scanner.nextInt();
                System.out.println("Your number: " + number);
                continueLoop = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Exception : " + ex);
                scanner.nextLine();
                System.out.println("Only integer parameters allowed. Try again!" + "\n");
            }
        }
        while(continueLoop);
    }
}
