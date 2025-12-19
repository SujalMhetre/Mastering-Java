package chapter08_0bject_oriented_programming.abstraction_interface.problem05_vehicle_system;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        System.out.println(((Fuel) car).fuelType());

        bike.start();
        System.out.println(((Fuel) bike).fuelType());
    }
}
