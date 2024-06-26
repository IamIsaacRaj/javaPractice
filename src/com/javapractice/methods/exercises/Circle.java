package com.javapractice.methods.exercises;

public class Circle {
    double radius;
    String color;

    void displayCircleDetails(){
        System.out.println("Circle Details : ");
        System.out.println("radius = " + radius);
        System.out.println("color = " + color);
    }

    void circleArea( double radius){
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " = " + area);
    }

    double circleCumference(double radius){
        return 2 * Math.PI * radius;
    }
}
