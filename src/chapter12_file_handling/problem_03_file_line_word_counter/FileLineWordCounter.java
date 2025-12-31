package chapter12_file_handling.problem_03_file_line_word_counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLineWordCounter {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;

        String filePath = "D:\\C-Documents\\GITHUB\\Mastering-Java\\src\\chapter12_file_handling\\problem_01_read_write_append\\profile.txt";

        File counterfile = new File(filePath);

        try (Scanner scanner = new Scanner(counterfile)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file!");
        }
        System.out.println("Total Lines :" + lineCount);
        System.out.println("Total words :" + wordCount);

    }
}
