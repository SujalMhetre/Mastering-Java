package chapter04_controlflow_statements;

import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1) Even or Odd.
        int number;

        System.out.println("Enter your number :");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even !!!");
        } else {
            System.out.println("Number is odd !!!");
        }


        // Q2) Compare two numbers.

        int a;
        int b;

        System.out.println("Enter your numbers :");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater!!!");
        } else if (a < b) {
            System.out.println(b + " is greater!!!");
        } else {
            System.out.println("Both are equal!!!");
        }


        // Q3) Pass or Fail

        int marks;

        System.out.println("Enter your marks :");
        marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Pass!!!");
        } else {
            System.out.println("Fail!!!");
        }


        // Q4) Discount Calculator

        int purchaseAmount;

        System.out.println("Enter your purchase amount :");
        purchaseAmount = sc.nextInt();

        if (purchaseAmount >= 5000) {
            int discountprice = (purchaseAmount * 20) / 100;
            int finalprice = purchaseAmount - discountprice;

            System.out.println("Your final amount after discount is :" + finalprice);
        } else if (purchaseAmount >= 2000 && purchaseAmount < 5000) {
            int discountprice = (purchaseAmount * 10) / 100;
            int finalprice = purchaseAmount - discountprice;

            System.out.println("Your final amount after discount is :" + finalprice);
        } else {
            int discountprice = (purchaseAmount * 5) / 100;
            int finalprice = purchaseAmount - discountprice;

            System.out.println("Your final amount after discount is :" + finalprice);
        }

        
        // Q5) Temperature Message


        int temp;

        System.out.println("Enter temperature (in C) :");
        temp = sc.nextInt();

        if (temp >= 30) {
            System.out.println("Hot!!");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("Normal!!!");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Cold!!!");
        } else {
            System.out.println("Very cold!!!");
        }


        // Q6)Day name using switch

        int day;

        System.out.println("Enter 1-7 to print day :");
        day = sc.nextInt();
        if (day >= 1 && day <= 7) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }

        } else {
            System.out.println("Error!!! enter valid number.");
        }


        // Q7) Simple Calculator
        
        int number1;
        int number2;

        System.out.println("Enter your numbers to perform operations");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        int op;
        System.out.println("Enter 1 = Add, 2 = Substract ,3 = Multiply, 4 = divide ");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Addition of two numbers is :" + (number1 + number2));
                break;
            case 2:
                System.out.println("Substraction of two numbers is :" + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is :" + (number1 * number2));
                break;
            case 4:
                System.out.println("Division of two numbers is :" + (number1 / number2));
                break;
            default:
                System.out.println("Error!! enter valid number.");
        }


        // Q8)Student Grade.

        int marksforgrade;

        System.out.println("Enter marks ranging form 0-100 :");
        marksforgrade = sc.nextInt();

        if (marksforgrade >= 0 && marksforgrade < 101) {
            if (marksforgrade >= 90) {
                System.out.println("Grade: A ");
            } else if (marksforgrade >= 80 && marksforgrade < 90) {
                System.out.println("Grade: B ");
            } else if (marksforgrade >= 70 && marksforgrade < 80) {
                System.out.println("Grade: C ");
            } else if (marksforgrade >= 60 && marksforgrade < 70) {
                System.out.println("Grade: D ");
            } else {
                System.out.println("Grade: Fail ");
            }
        } else {
            System.out.println("Error !!! enter valid number");
        }


        // Q9) character type

        char single;

        System.out.println("Enter any single character :");
        single = sc.next().charAt(0);
        System.out.println();

        if (single >= 'a' && single <= 'z') {
            System.out.println("LowerCase");
        } else if (single >= 'A' && single <= 'Z') {
            System.out.println("Uppercase");
        } else if (single >= 0 && single < 10) {
            System.out.println("Digits");
        } else {
            System.out.println("Special character");
        }


        // Q10) Leap Year Checker

        int year;

        System.out.println("Enter a year to check :");
        year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
