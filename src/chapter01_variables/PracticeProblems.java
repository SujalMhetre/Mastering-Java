package chapter01_variables;

import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Q1) Write a program to sum 3 numbers */
        int a, b, c, sum1 = 0;

        System.out.println("Enter your numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sum1 = a + b + c;

        System.out.println("Sum of the numbers is =" + sum1);


        /* Q2) Write a program to calculate percentage of student,take 5 subjects marks as input (out of 100 marks)*/
        int sum2 = 0;
        float total_marks = 500f;
        float percentage;
        int s1_marks, s2_marks, s3_marks, s4_marks, s5_marks;


        System.out.println("Enter your marks for 5 subjects :");
        s1_marks = sc.nextInt();
        s2_marks = sc.nextInt();
        s3_marks = sc.nextInt();
        s4_marks = sc.nextInt();
        s5_marks = sc.nextInt();

        sum2 = s1_marks + s2_marks + s3_marks + s4_marks + s5_marks;

        percentage = (sum2 / total_marks) * 100;

        System.out.printf("Percentage of the student is =%.2f%%", percentage);


        /* Q3) Write a program to let the user enter their name and then greet the user with out text hello <nam> have a good day*/
        String name;


        System.out.println("Enter your name :");
        name = sc.nextLine();

        System.out.printf("Hello %s,have a good day!!!", name);


        /* Q4) Write a program to convert kilometers to miles*/
        int kilometers;


        System.out.println("Enter distance in Km to convert in Miles : ");
        kilometers = sc.nextInt();

        System.out.println("After conversion Km to miles=" + kilometers * 0.621371);


        /* Q5) Write a program to check whether the entered number by the user is an integer or not*/
        int n;

        System.out.println("Enter your number :");
        boolean isinteger = sc.hasNextInt();

        System.out.println("Is the entered number an integer :" + isinteger);

        sc.close();
    }
}
