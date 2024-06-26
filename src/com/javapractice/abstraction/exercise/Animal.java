package com.javapractice.abstraction.exercise;

abstract  class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("----------------------");
    }

    abstract void makeSound();
    abstract void move();
}
