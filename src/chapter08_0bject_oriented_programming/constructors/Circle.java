package chapter08_0bject_oriented_programming.constructors;

public class Circle {
    double radius;
    final double pi = Math.PI;

    Circle(double radius) {
        this.radius = 10;
    }

    double areaOfCircle() {
        return pi * radius * radius;
    }

    double perimeterOfCircle() {
        return 2 * pi * radius;
    }

    void display() {
        System.out.println("Area of Circle      :" + areaOfCircle());
        System.out.println("Perimeter of Circle :" + perimeterOfCircle());
    }
}
