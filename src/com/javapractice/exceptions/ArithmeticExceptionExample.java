package com.javapractice.exceptions;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the dividend Number : ");
            int dividend = scanner.nextInt();
            System.out.println("Enter the divisor Number : ");
            int divisor = scanner.nextInt();

            int reminder = dividend/divisor;

            System.out.println("reminder = " + reminder);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

    }
}
