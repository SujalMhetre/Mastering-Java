package chapter08_0bject_oriented_programming.encapsulation.problem05_ATMTransactionRules;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private int balance;

    BankAccount(long accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        setAccountHolderName(accountHolderName);
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("error Enter your balance ");
        }
    }

    //    Setters

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    //    Getters
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

//    Methods

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + "$");
            System.out.println("New Balance :" + balance);
        } else {
            System.out.println("error enter valid amount");
        }
    }

    public void withdraw(int amount) {
        if (amount >= 100 && amount <= 50000 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn " + amount + "$");
            System.out.println("New Balance :" + balance);
        } else if (amount < 100 || amount > 50000) {
            System.out.println("Minimum 100 $ and Maximum 50000 is required per transaction");
        } else {
            System.out.println("Insufficient balance!!!!");
        }
    }
}
