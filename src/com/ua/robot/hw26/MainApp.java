package com.ua.robot.hw26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("Please enter a positive number:");
            double x = input.nextDouble();
            System.out.println(numberSquared(x));
        }
        catch(NegativeException ex){
            System.out.println("Exception handling");
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
        catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
        System.out.println("Program is finished.");
    }

    private static double numberSquared(double number) throws NegativeException {
        if (number < 0){
            throw new NegativeException("The number cannot be negative ", number);
        }
        return Math.round(number * number);
    }
}

class NegativeException extends Exception {
    private double number;
    public double getNumber() {
        return number;}

    public NegativeException(String message, double num){
        super(message);
        number = num;
    }

}
