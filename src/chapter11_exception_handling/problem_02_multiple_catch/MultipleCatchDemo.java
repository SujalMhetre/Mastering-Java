package chapter11_exception_handling.problem_02_multiple_catch;

import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numbers = {1,2,3,4}; // if set to = null this will throw NullPointerException

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        try {
            System.out.println(numbers[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }


        scanner.close();
    }
}
