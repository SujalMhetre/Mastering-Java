package chapter08_0bject_oriented_programming.classes_objects;

public class Car {
    String brand;
    String model;
    double price;


    void detailsDisplay() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    void start() {
        System.out.println(brand + " " + model + " has started");
    }
}
