package chapter08_0bject_oriented_programming.classes_objects;

public class BankMain {
    public static void main(String[] args) {

        BankAccount user = new BankAccount();
        user.holderName = "Sujal Mhetre";
        user.accountNumber = 123456;
        user.balance = 50000;

        System.out.println("*****************");
        user.displayDetails();
        System.out.println("****************");

        user.deposit(10000);
        user.withdraw(5000);
        user.displayBalance();
    }
}
