package com.javapractice.exceptions;

import java.util.Scanner;

public class IllegalArgumentExceptionExample {
    
    public static double calculateSquareRoot(double num){
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the  Number : ");
            int number = scanner.nextInt();
            double sqrtOfNumber = calculateSquareRoot(number);
            System.out.println("Square root Of Number = " + sqrtOfNumber);
        } catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException Caught: " + e.getMessage());
        }
    }
}
