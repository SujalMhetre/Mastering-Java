package chapter08_0bject_oriented_programming.abstraction_interface.problem02_bank_account;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1234, 50000, 4);

        CurrentAccount currentAccount = new CurrentAccount(4321, 40000, 2);

        System.out.println("*************SavingsAccount***************");

        savingsAccount.displayDetails();
        System.out.println(savingsAccount.calculateInterest());

        System.out.println("*************CurrentAccount***************");

        currentAccount.displayDetails();
        System.out.println(currentAccount.calculateInterest());
    }
}
