package chapter08_0bject_oriented_programming.polymorphism.problem03_shape_area_calculation;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle(5, "Circle"),
                new Triangle(4, 7, "Triangle"),
                new Rectangle(10, 8, "Rectangle")};

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.name + "  :" + shape.calculateArea());
        }
    }
}
