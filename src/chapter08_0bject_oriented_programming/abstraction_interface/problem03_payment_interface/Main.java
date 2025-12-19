package chapter08_0bject_oriented_programming.abstraction_interface.problem03_payment_interface;

public class Main {
    public static void main(String[] args) {

        Payment upi = new UPIPayment();
        Payment card = new CardPayment();
        Payment netbanking = new NetBankingPayment();

        upi.pay(1000);
        card.pay(1000);
        netbanking.pay(1000);


    }
}
