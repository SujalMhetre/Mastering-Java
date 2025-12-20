package chapter08_0bject_oriented_programming.polymorphism.problem04_payment_processing;

public class CashPayment extends Payment{

    CashPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Payment done via Cash");
    }
}
