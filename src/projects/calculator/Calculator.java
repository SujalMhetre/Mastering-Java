package projects.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("=============MENU===============");
            System.out.println("""
                    1.Addition
                    2.Substraction
                    3.Multiplication
                    4.Division
                    5.Exit
                    """);
            System.out.println("Choose an option :");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("You exited the calculator, BYE!!!");
                break;
            }

            double a = 0;
            double b = 0;

            if (choice > 0 && choice < 5) {
                System.out.println("Enter your first number :");
                a = sc.nextInt();

                System.out.println("Enter your second number :");
                b = sc.nextInt();
            } else {
                System.out.println("Enter valid input!!!!");
            }

            double result;
            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.printf("Addition of %.0f and %.0f is: %.0f\n", a, b, result);
                    break;
                case 2:
                    result = a - b;
                    System.out.printf("Substraction of %.0f and %.0f is: %.0f\n", a, b, result);
                    break;
                case 3:
                    result = a * b;
                    System.out.printf("Multiplication of %.0f and %.0f is: %.0f\n", a, b, result);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error cannot divide by zero!!");
                        break;
                    }
                    result = a / b;
                    System.out.printf("Division  of  %.0f and %.0f is: %.0f\n", a, b, result);
                    break;


            }

        }
    }
}
