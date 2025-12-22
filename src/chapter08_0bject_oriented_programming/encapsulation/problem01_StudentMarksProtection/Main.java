package chapter08_0bject_oriented_programming.encapsulation.problem01_StudentMarksProtection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name :");
        String student1Name = scanner.nextLine();

        System.out.println("Enter your marks :");
        int student1Marks = scanner.nextInt();

        Student student1 = new Student(student1Name, student1Marks);

        System.out.println(student1.getMarks());
        System.out.println(student1.getName());



    }
}
