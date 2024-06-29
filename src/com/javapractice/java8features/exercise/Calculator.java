package com.javapractice.java8features.exercise;
@FunctionalInterface
public interface Calculator {

    int calculate(int a, int b);

    default void displayResult(int result){
        System.out.println("Result = " + result);
    }
}
