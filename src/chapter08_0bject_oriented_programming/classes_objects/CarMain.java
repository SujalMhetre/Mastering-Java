package chapter08_0bject_oriented_programming.classes_objects;

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Ford";
        car1.model = "Mustang";
        car1.price = 1000000.99;

        car1.detailsDisplay();
        car1.start();
    }
}
