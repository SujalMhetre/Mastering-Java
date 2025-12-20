package chapter08_0bject_oriented_programming.polymorphism.problem05_vehicle_start_test;

public class Bike extends Vehicle{
    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("The bike has started");
    }
}
