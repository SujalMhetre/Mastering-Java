package chapter08_0bject_oriented_programming.abstraction_interface.problem08_online_shopping_system;

public abstract class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void displayDetails() {
        System.out.println("Product name: " + this.name + " Price: " + this.price);
    }
}
