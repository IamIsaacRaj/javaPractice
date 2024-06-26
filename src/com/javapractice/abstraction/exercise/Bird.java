package com.javapractice.abstraction.exercise;

public class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Birds sounds as 'Chirping'");
    }

    @Override
    void move() {
        System.out.println("Birds 'Fly' in the sky");
    }
}
