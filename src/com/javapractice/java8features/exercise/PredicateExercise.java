package com.javapractice.java8features.exercise;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExercise {
    public static void main(String[] args) {
//  Question 2: Use a Predicate to check if a given integer is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();

        if(isEven.test(num)){
            System.out.println("Given number " + num + " is Even");
        }else
            System.out.println("Given number " + num + " is Odd");
    }
}
