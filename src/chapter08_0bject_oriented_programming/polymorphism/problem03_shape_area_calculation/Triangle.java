package chapter08_0bject_oriented_programming.polymorphism.problem03_shape_area_calculation;

public class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height,String name) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
