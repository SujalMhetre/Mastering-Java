package chapter08_0bject_oriented_programming.abstraction_interface.problem03_payment_interface;

public class NetBankingPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via NETBANKING");
    }
}
