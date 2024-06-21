package javaPractice.methods;

public class Car {

    String brand;
    String model;
    String color;
    int year;
    double price;

    void displayCarDetails(){
        System.out.println("Car Details :");
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("year = " + year);
        System.out.println("price = " + price);
    }
}
