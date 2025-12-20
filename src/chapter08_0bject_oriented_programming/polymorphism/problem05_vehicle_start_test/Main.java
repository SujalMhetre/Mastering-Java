package chapter08_0bject_oriented_programming.polymorphism.problem05_vehicle_start_test;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Ford");
        Vehicle bike = new Bike("KTM");
        Vehicle truck = new Truck("Mercedes");

        VehicleTester tester = new VehicleTester();

        tester.testDrive(car);
        tester.testDrive(bike);
        tester.testDrive(truck);


    }
}
