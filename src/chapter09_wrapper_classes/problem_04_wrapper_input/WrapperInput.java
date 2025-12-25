package chapter09_wrapper_classes.problem_04_wrapper_input;

import java.util.Scanner;

public class WrapperInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        Integer myInt = scanner.nextInt();

        System.out.println(myInt);
        scanner.close();
    }
}
