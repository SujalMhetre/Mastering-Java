package chapter08_0bject_oriented_programming.abstraction_interface.problem02_bank_account;

public class CurrentAccount extends BankAccount{
    int interestRate;

    CurrentAccount(double accountNumber, double balance, int interestRate){
        super(accountNumber,balance);
        this.interestRate= interestRate;
    }

    @Override
    public double calculateInterest(){
        return balance * interestRate/ 100;

    }
}
