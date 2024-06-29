package com.javapractice.java8features.functional_interface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
/*  The Predicate interface represents a boolean-valued function of
    one argument. It is commonly used for filtering or matching conditions.
*/

        List<String> names = List.of("Raju","Esha","Janaki","Jagan","Ramu");

        // Predicate to check names start with R
        Predicate<String> startsWithR = str -> str.startsWith("R");

        //Filter the list using the Predicate
        List<String> filteredNames = names.stream()
                .filter(startsWithR)
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        Predicate<Integer> isPositive = (number) -> number > 0;
        System.out.println(isPositive.test(5)); // Output: true
        System.out.println(isPositive.test(-5)); // Output: false


    }
}
