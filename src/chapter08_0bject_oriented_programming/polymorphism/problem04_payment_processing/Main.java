package chapter08_0bject_oriented_programming.polymorphism.problem04_payment_processing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which payment method u want to choose ? (1 = Card , 2 = UPI, 3 = Cash) ");
        int choice = scanner.nextInt();

        System.out.println("Enter your amount :");
        double amount = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter your Card number :");
            double cardNumber = scanner.nextDouble();
            Payment payment = new CreditCardPayment(cardNumber, amount);
            payment.processPayment();
        } else if (choice == 2) {
            System.out.println("Enter your UPI Id: ");
            double upiId = scanner.nextDouble();
            Payment payment = new UPIPayment(amount, upiId);
            payment.processPayment();
        } else if (choice == 3) {
            Payment payment = new CashPayment(amount);
            payment.processPayment();
        } else {
            System.out.println("Enter valid choice!!!!");
        }
    }
}
