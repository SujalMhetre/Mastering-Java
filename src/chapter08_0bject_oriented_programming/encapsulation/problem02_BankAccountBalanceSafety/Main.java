package chapter08_0bject_oriented_programming.encapsulation.problem02_BankAccountBalanceSafety;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount user1 = new BankAccount("Sujal Mhetre", 12345, 500);

        System.out.println("Name :" + user1.getAccountHolderName());
        System.out.println("Account-no :" + user1.getAccountNumber());
        System.out.println("Balance :" + user1.getBalance());

        System.out.println("Enter amount to deposit ?");
        int amount = scanner.nextInt();
        user1.deposit(amount);

        System.out.println("Enter amount to withdraw money?");
        amount = scanner.nextInt();
        user1.withdraw(amount);


    }
}
