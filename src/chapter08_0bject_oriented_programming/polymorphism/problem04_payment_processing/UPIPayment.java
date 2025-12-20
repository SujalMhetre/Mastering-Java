package chapter08_0bject_oriented_programming.polymorphism.problem04_payment_processing;

public class UPIPayment extends Payment {

    double upiId;

    UPIPayment(double amount, double upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Payment done via UPI");
    }
}
