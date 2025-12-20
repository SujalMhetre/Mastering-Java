package chapter08_0bject_oriented_programming.polymorphism.problem04_payment_processing;

public class CreditCardPayment extends Payment{
    double cardNumber;

    CreditCardPayment(double cardNumber,double amount){
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Payment done via Card");
    }
}
