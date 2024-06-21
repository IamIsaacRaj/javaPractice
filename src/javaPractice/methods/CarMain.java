package javaPractice.methods;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.color = "White";
        car1.year = 2022;
        car1.price = 2088791.25;

        car1.displayCarDetails();

        Car car2 = new Car();

        car2.brand = "Tesla";
        car2.model = "Model 3";
        car2.color = "Red";
        car2.year = 2023;
        car2.price = 2924307.75;
        car2.displayCarDetails();

    }
}
