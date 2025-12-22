package chapter08_0bject_oriented_programming.encapsulation.problem05_ATMTransactionRules;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount user1 = new BankAccount(214664, "Sujal", 10000);

        user1.setAccountHolderName("Sujal Mhetre");

        System.out.println("Name :" + user1.getAccountHolderName());
        System.out.println("Account-no :" + user1.getAccountNumber());
        System.out.println("Balance :" + user1.getBalance());

        int amount;
        System.out.println("Enter your amount to deposit ?");
        amount = scanner.nextInt();
        user1.deposit(amount);

        System.out.println("Enter your amount to withdraw ?");
        amount = scanner.nextInt();
        user1.withdraw(amount);

    }
}
