package com.javapractice.abstraction.exercise;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog sounds as 'Bow bow'");
    }

    @Override
    void move() {
        System.out.println("Dogs do walking and Running");
    }
}
