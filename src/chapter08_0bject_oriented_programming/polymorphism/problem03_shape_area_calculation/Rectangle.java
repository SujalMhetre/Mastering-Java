package chapter08_0bject_oriented_programming.polymorphism.problem03_shape_area_calculation;

public class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width,String name) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
