package chapter08_0bject_oriented_programming.abstraction_interface.problem05_vehicle_system;

public class Bike extends Vehicle implements Fuel{
    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    void start() {
        System.out.println("The bike has started");
    }
}
