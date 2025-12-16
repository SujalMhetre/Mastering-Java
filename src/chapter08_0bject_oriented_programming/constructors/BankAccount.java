package chapter08_0bject_oriented_programming.constructors;

public class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void depositMoney(double money) {
        balance += money;
        System.out.println("Successfully deposited " + money + "Rs");
    }

    void withdrawMoney(double money) {
        if (balance > money) {
            balance -= money;
            System.out.println("Successfully withdrawn " + money + "Rs");
        } else {
            System.out.println("Insufficient Balance");
        }

    }

    void displayBalance() {
        System.out.println("New Balance :" + balance);
    }

    void displayDetails() {
        System.out.println("Account-number :" + accountNumber);
        System.out.println("Username       :" + holderName);
        System.out.println("Balance        :" + balance);
    }
}
