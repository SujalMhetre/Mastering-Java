package chapter05_loops;

import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q) While loop problems

        //1)Print numbers from 1 to 10 using a while loop.

        int numbers = 1;

        while (numbers <= 10) {
            System.out.println(numbers);
            numbers++;
        }

        // 2)Print all even numbers from 1 to 50.

        int evennumber = 1;

        while (evennumber <= 50) {
            if (evennumber % 2 == 0) {
                System.out.println(evennumber);

            }
            evennumber++;
        }

        // 3)Print numbers from 10 to 1 in reverse.

        int n = 10;

        while (n > 0) {
            System.out.println(n);
            n--;
        }

        // 4)Print the sum of numbers from 1 to 100.

        int sum = 0;
        int num = 1;

        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("Sum of the numbers is :" + sum);

        // 5)Take a number from the user and print its multiplication table, like 5 × 1…10.

        int table;


        System.out.println("Enter a number to print its table:");
        table = sc.nextInt();

        System.out.printf("Table of %d =\n", table);
        int i = 1;
        while (i <= 10) {
            System.out.println(table * i);
            i++;
        }

        // Q) do/While loop problems

        // 1️)Print numbers from 1 to 10 using a do–while loop.

        int n1 = 1;
        do {
            System.out.println(n1);
            n1++;
        } while (n1 <= 10);

        // 2)Print numbers from 10 to 1.

        int n2 = 10;
        do {
            System.out.println(n2);
            n2--;
        } while (n2 >= 1);

        // 3)Print the multiplication table of a number (take input).

        int number1;

        System.out.println("enter a number to print its table:");
        number1 = sc.nextInt();

        System.out.printf("Table of %d is:\n", number1);
        int i2 = 1;
        do {
            System.out.printf("%d * %d = %d\n", number1, i2, number1 * i2);
            i2++;
        } while (i2 <= 10);


        //  4) Print all even numbers from 1 to 50.

        int i3 = 1;
        do {
            if (i3 % 2 == 0) {
                System.out.println(i3);
            }
            i3++;
        } while (i3 <= 50);

        // 5)Keep printing numbers until the user enters a negative number.

        int usernumber;

        do {
            System.out.println("Enter your number :");
            usernumber = sc.nextInt();
            if (usernumber > 0) {
                System.out.println("Your number is :" + usernumber);
            }
        } while (usernumber > 0);


        // Q) For loop problems

        // 1️) Print numbers from 1 to 10 using a for loop.

        for (int i4 = 1; i4 <= 10; i4++) {
            System.out.println(i4);
        }

        //  2) Print numbers from 10 to 1 in reverse.

        for (int i5 = 10; i5 > 0; i5--) {
            System.out.println(i5);
        }

        // 3)Print the multiplication table of a number (take input).

        int user;
        System.out.println("Enter a number a print its table :");
        user = sc.nextInt();

        for (int i6 = 1; i6 <= 10; i6++) {
            System.out.println(user * i6);
        }

        // 4)Print the sum of numbers from 1 to 100.

        int sum1 = 0;
        for (int i7 = 1; i7 <= 100; i7++) {
            sum1 += i7;
        }
        System.out.println(sum1);

        // 5) Print all even numbers from 1 to 50.

        for (int i8 = 1; i8 <= 50; i8++) {
            if (i8 % 2 == 0) {
                System.out.println(i8);
            }
        }

        sc.close();
    }
}
