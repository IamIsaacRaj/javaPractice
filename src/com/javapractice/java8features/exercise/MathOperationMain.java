package com.javapractice.java8features.exercise;

public class MathOperationMain {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;

        System.out.print("Addition ");
        add.displayResult(add.calculate(5, 3));

        System.out.print("Subtraction ");
        add.displayResult(sub.calculate(5, 3));

    }


}
