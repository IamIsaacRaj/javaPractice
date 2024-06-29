package com.javapractice.java8features.exercise;

import java.util.function.Function;

public class CustomFunctionalInterface {
    public static void main(String[] args) {

        Function<String,String> stringModifier = string -> new StringBuilder(string).reverse().toString();

        String stringInput = "Hello World!";
        System.out.println("Original string Input = " + stringInput);

        String revered = stringModifier.apply(stringInput);

        System.out.println("Revered string = " + revered);
    }
}
