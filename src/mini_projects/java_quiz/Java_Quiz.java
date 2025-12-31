package  mini_projects.java_quiz;

import java.util.Scanner;

public class Java_Quiz {
    public static void main(String[] args) {
        String[] questions = {"Which of the following is not a primitive data type in Java?",
                "Which keyword is used to inherit a class in Java?",
                "Which of these loops will execute at least once even if the condition is false?",
                "What is the output of the following code? " +
                        "(System.out.println(10 + 20 + \"30\"));",
                "Which method is called when an object is garbage collected?"};

        String[][] options = {{"1. Int", "2.Boolean", "3.String", "4.Double"},
                {"1. Implements", "2.Extends", "3.Super", "4.this"},
                {"1. for", "2.while", "3.do-while", "4.if"},
                {"1. 3030", "2.102030", "3.30", "4.1030"},
                {"1. finalize()", "2.collect()", "3.destroy()", "4.delete()"}};

        int[] answers = {3, 2, 3, 1, 1};

        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Welcome to JAVA Quiz :");
        System.out.println("*******************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("Correct!!!");
                score++;
            } else {
                System.out.println("Wrong!!!");
            }
        }
        System.out.println(" Your final score is: " + score + " out of " + questions.length);
        if (score == 5) {
            System.out.println("You are the GOAT!!!");
        }
        scanner.close();
    }
}