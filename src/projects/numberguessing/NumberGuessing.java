package projects.numberguessing;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        int number = 0;

        Scanner sc = new Scanner(System.in);

        int comp;
        comp = (int) (Math.random() * 100) + 1;

        int attempts = 0;
        while (true) {
            System.out.println("Enter your number to guess :");
            number = sc.nextInt();
            attempts++;
            if (number > comp) {
                System.out.println("Guess lower");
            } else if (number < comp) {
                System.out.println("Guess higher");
            } else {
                System.out.println("Correct Guess");
                break;
            }

        }
        System.out.printf("You won in %d attempts!!", attempts);

    }
}
