package chapter11_exception_handling.problem_03_finally_block;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try {
            double division = number1 / number2;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Resource closed");
            scanner.close();
        }
    }
}
