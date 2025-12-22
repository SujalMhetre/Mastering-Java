package chapter08_0bject_oriented_programming.encapsulation.problem02_BankAccountBalanceSafety;

public class BankAccount {

    private String accountHolderName;
    private double accountNumber;
    private int balance;

    BankAccount(String accountHolderName, double accountNumber, int balance) {
        setAccountHolderName(accountHolderName);
        setAccountNumber(accountNumber);
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("error  ");
        }

    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + "$");
        } else {
            System.out.println("Enter valid amount!!!");
        }
    }

    void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn " + amount + " $");
        } else {
            System.out.println("Insufficent balance");
        }
    }
}
