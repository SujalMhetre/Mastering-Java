package chapter08_0bject_oriented_programming.abstraction_interface.problem05_vehicle_system;

public class Car extends Vehicle implements Fuel{
    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    void start() {
        System.out.println("The car has started");
    }
}
