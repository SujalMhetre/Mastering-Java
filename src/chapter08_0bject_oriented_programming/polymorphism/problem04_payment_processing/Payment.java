package chapter08_0bject_oriented_programming.polymorphism.problem04_payment_processing;

public abstract class Payment {

    double amount;

    Payment( double amount){
        this.amount =  amount;
    }
    abstract void processPayment();
}
