package chapter12_file_handling.problem_04_word_frequency_counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "D:\\C-Documents\\GITHUB\\Mastering-Java\\src\\chapter12_file_handling\\problem_01_read_write_append\\profile.txt";

        File counterFile = new File(filePath);

        String targetWord = "Satyam";
        int wordFreqCounter = 0;

        try (Scanner scanner = new Scanner(counterFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.trim().split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        wordFreqCounter++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file");
        }

        if (wordFreqCounter == 0) {
            System.out.println("Word not found in the file");
        } else {
            System.out.println("The word " + targetWord + " appears " + wordFreqCounter + " times ");
        }

    }
}
