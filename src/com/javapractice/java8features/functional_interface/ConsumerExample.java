package com.javapractice.java8features.functional_interface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
/*  The Consumer interface represents an operation that accepts a single
    input argument and returns no result. It is typically used for operations
    that perform side effects.
*/
        Consumer<String> printuppercase = str -> System.out.println(str.toUpperCase());

        printuppercase.accept("hello World");

        List<String> names = List.of("John", "Jane", "Jack");

        Consumer<String> printName = System.out::println;

        names.forEach(printName);
    }
}
