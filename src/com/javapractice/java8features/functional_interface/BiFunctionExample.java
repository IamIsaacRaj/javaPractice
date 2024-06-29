package com.javapractice.java8features.functional_interface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

/*  The BiFunction interface represents a function that accepts two arguments 
    and produces a result. It is useful for operations that require 
    two input arguments.
*/
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a + b;
        
        int result = add.apply(5,10);
        System.out.println("result = " + result);
    }
}
