package chapter08_0bject_oriented_programming.polymorphism.problem03_shape_area_calculation;

public abstract class Shape {

    String name;
    Shape(String name){
        this.name = name;
    }

    abstract double calculateArea();
}
