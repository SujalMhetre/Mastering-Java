package chapter08_0bject_oriented_programming.abstraction_interface.problem02_bank_account;

public abstract class BankAccount {

    double accountNumber;

    double balance;

    BankAccount(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Abstract method
    abstract double calculateInterest();

    //Concrete method
    void displayDetails() {
        System.out.println("Account-NO :" + accountNumber);
        System.out.println("Balance :" + balance);
    }

}
