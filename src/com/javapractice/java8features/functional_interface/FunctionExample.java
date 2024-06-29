package com.javapractice.java8features.functional_interface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
/*  The Function interface represents a function that accepts one argument
    and produces a result. It is often used for mapping or transforming data.
*/
//      Function to convert an Integer to String using method reference
        Function<Integer, String> intToString = String::valueOf;
//      Function<Integer, String> intToString = i -> Integer.toString(i);

        String result = intToString.apply(5);
        System.out.println("result = " + result);




    }
}
