package chapter08_0bject_oriented_programming.abstraction_interface.problem08_online_shopping_system;

public class Clothing extends Product implements Deliverable {
    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double deliveryCharge() {
        return 100;
    }

    @Override
    double calculateDiscount() {
        return price * 20 / 100;
    }
}
