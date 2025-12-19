package chapter08_0bject_oriented_programming.abstraction_interface.problem08_online_shopping_system;

public class Electronics extends Product implements Deliverable {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double deliveryCharge() {
        return 200;
    }

    @Override
    double calculateDiscount() {
        return price * 10 / 100;
    }
}
