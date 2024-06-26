package com.javapractice.abstraction.exercise;

 public class AnimalTest {

  public static void main(String[] args) {
   Dog dog = new Dog();
   Dog dog1 = new Dog("Alex",7);

   dog.displayDetails();
   dog1.displayDetails();
   dog1.makeSound();
   dog1.makeSound();

   Bird bird = new Bird();
   Bird bird1 = new Bird("Joe",4);

   bird.displayDetails();
   bird1.displayDetails();
   bird1.makeSound();
   bird1.move();

  }
}
