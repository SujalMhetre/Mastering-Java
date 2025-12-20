package chapter08_0bject_oriented_programming.polymorphism.problem03_shape_area_calculation;

public class Circle extends Shape {
    double radius;

    Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
