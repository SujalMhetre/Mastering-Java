package chapter08_0bject_oriented_programming.classes_objects;

public class BankAccount {
        int accountNumber;
        String holderName;
        int balance;

        void displayDetails() {
            System.out.println("Name :" + holderName);
            System.out.println("Account number :" + accountNumber);
            System.out.println("Balance :" + balance);
        }

        void deposit(int amount) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        }

        void withdraw(int amount) {
            balance -= amount;
            System.out.println("Successfully withdrawn " + amount);

        }

        void displayBalance() {
            System.out.println(balance);
        }
    }


