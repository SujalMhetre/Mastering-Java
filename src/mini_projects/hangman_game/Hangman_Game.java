package  mini_projects.hangman_game;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman_Game {
    public static void main(String[] args) {


        String filePath = "D:\\C-Documents\\GITHUB\\Mastering-Java\\src\\projects\\hangman_game\\words.txt";

        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) {
        }) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file");
        } catch (IOException e) {
            System.out.println("Something Went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));


        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }


        System.out.println("****************************");
        System.out.println(" Welcome to HangMan Game ");
        System.out.println();

        int wrongGuesses = 0;

        while (wrongGuesses < 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word : ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a Letter :");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                    if (!wordState.contains('_')) {
                        System.out.println("You Won");
                        System.out.println(getHangmanArt(wrongGuesses));
                        System.out.println("The word was :" + word);
                        return;
                    }
                }

            } else {
                wrongGuesses++;
                System.out.println("Wrong Guess");
            }
        }
        if (wrongGuesses >= 6) {
            System.out.println("Game Over");
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("The word was :" + word);
        }

    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                      0
                    
                    
                    """;
            case 2 -> """
                      0
                      |
                    
                    """;
            case 3 -> """
                      0
                    / |
                    
                    """;
            case 4 -> """
                      0
                    / | \\
                    
                    """;
            case 5 -> """
                      0
                    / | \\
                    /
                    """;
            case 6 -> """
                      0
                    / | \\
                    /   \\
                    """;
            default -> "";
        };
    }
}