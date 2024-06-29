package com.javapractice.java8features.anonymous_inner_class;

public class AnonymousInnerClassMain {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello this is Anonymous Inner Class Greeting");
            }
        };

        greeting.greet();
    }
}
