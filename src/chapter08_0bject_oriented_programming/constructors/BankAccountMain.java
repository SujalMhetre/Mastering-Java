package chapter08_0bject_oriented_programming.constructors;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount(1234, "Sujal Mhetre", 50000);

        System.out.println("*********User1**********");
        user1.displayDetails();

        user1.depositMoney(1000);
        user1.withdrawMoney(20000);
        user1.displayBalance();

        BankAccount user2 = new BankAccount(4321, "Satyam Verma", 60000);

        System.out.println("*********User2**********");
        user2.displayDetails();

        user2.depositMoney(1000);
        user2.withdrawMoney(20000);
        user2.displayBalance();
    }
}
