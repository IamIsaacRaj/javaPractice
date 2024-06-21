package javaPractice.methods;

public class CircleMain {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.radius = 10;
        circle.color = "Blue";

        circle.displayCircleDetails();

        double radius = circle.radius;
//        Area of the circle
        circle.circleArea(radius);

        double circumferenceOfCircle = circle.circleCumference(radius);
        System.out.println("Circumference of the Circle = " + circumferenceOfCircle);
    }
}
