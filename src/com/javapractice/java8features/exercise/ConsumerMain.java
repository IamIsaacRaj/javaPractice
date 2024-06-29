package com.javapractice.java8features.exercise;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerMain {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack");

        // Consumer to print each name
        Consumer<String> printUpperCaseNames;
        printUpperCaseNames = string -> System.out.println(string.toUpperCase());

        // Applying the consumer to each element in the list
        names.forEach(printUpperCaseNames);
    }
}
