package com.javapractice.java8features.functional_interface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
/*  The Supplier interface represents a supplier of results.
    It does not take any arguments and returns a result.    */

        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(10);

        int randomNumber = randomNumberSupplier.get();

        System.out.println("Random Number from 0 to 1 = " + randomNumber);
    }
}
