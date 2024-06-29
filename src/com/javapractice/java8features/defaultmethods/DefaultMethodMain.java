package com.javapractice.java8features.defaultmethods;

public class DefaultMethodMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.stop();// it's a default method implemented on interface
    }
}
