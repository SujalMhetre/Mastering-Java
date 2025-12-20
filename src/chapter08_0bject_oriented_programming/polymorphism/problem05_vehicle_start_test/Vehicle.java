package chapter08_0bject_oriented_programming.polymorphism.problem05_vehicle_start_test;

public abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();
}
