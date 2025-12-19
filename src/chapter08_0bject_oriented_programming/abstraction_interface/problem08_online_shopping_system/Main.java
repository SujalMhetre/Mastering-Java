package chapter08_0bject_oriented_programming.abstraction_interface.problem08_online_shopping_system;

public class Main {
    public static void main(String[] args) {

        Electronics product = new Electronics("Washing Machine", 25000);
        Clothing product1 = new Clothing("Blazzer", 5000);

        product.displayDetails();
        System.out.println("Discount: " + product.calculateDiscount());
        System.out.println("Delivery Charge :" + product.deliveryCharge());

        product1.displayDetails();
        System.out.println("Discount: " + product1.calculateDiscount());
        System.out.println("Delivery Charge :" + product1.deliveryCharge());
    }
}
