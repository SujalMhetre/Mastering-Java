package chapter02_operators_expressions;

import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        /*
          Q1)What will be the result of the following expression:
          float a = 7/4 * 9/2
         */

        float A = 0;
        A = 7 / 4 * 9 / 2;
        System.out.println("Answer:" + A);

        // Q2)Write a program to encrypt a grade by adding 8 to it.decrypt it to show
        // the correct grade.

        char grade = 'A';
        grade += 8;
        grade--;
        System.out.println(grade);

        // Q3)Use comparison operators to find out whether a given number is greater
        // than the user entered number or not.

        int number = 10;
        int givenNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        givenNumber = sc.nextInt();

        System.out.println(givenNumber > number);
        sc.close();

        // Q4)Write the following expressions in a java program

        int v = 1, u = 2, a = 3, s = 4;
        System.out.println((v * v - u * u) / (2 * a * s));

        // Q5) Find the value os the following expression
        int x = 7;
        int b = 0;
        b = (7 * 49 / 7 + 35 / 7);

        System.out.println(b);
    }
}
