package chapter11_exception_handling.problem_01_division_safety;

import java.util.Scanner;

public class DivisionSafety {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try {
            double division = number1 / number2;
            System.out.println(division);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!!");
        }
        scanner.close();
    }
}
