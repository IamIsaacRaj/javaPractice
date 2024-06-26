package com.javapractice.loops.exercises;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
/*  Factorial
    The Factorial of a whole number 'n' is defined as the product of that
    number with every whole number less than or equal to 'n' till 1.
    factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
    For example, the factorial of 4 is 4 × 3 × 2 × 1, which is equal to 24.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
