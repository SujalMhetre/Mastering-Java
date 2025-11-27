package projects.atmsystem;

import java.util.Scanner;

public class ATM_System {

    public static void main(String[] args) {

        int user1pin = 1234;
        int balance = 50000;
        boolean access = false;

        Scanner sc = new Scanner(System.in);

        for (int attempts = 1; attempts <= 3; attempts++) {
            System.out.println("Enter your pin:");
            int pin = sc.nextInt();
            if (pin == user1pin) {
                System.out.println("Correct pin,You can Access your account!!");
                access = true;
                break;
            } else {
                System.out.println("Wrong Pin,attempts left" + (3 - attempts));
            }
        }

        if (!access) {
            System.out.println("You have used all your attempts,Card is blocked!!!");
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.print("""
                    ======ATM MENU=====
                    1.Check Balance
                    2.Deposit Money
                    3.Withdraw Money
                    4.Exit
                    """);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance = " + balance + "$");
                    break;
                case 2:
                    System.out.println("Enter your amount to deposit :");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        System.out.println("Successfully deposited " + deposit + "$ in your account");
                        balance += deposit;
                        System.out.println("New balance = " + balance + "$");
                    } else {
                        System.out.println("Invalid amount..");
                    }
                    break;
                case 3:
                    System.out.println("Enter your amount to withdraw:");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance! Transaction Failed...");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid amount...");
                    } else {
                        System.out.println("Successfully withdrawn " + withdraw + "$ from your account");
                        balance -= withdraw;
                        System.out.println("New balance =" + balance + "$");
                    }
                    break;
                case 4:
                    System.out.println("Successfully Exited menu...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option!! Choose 1-4");
                    break;
            }
        }
        sc.close();
    }
}


