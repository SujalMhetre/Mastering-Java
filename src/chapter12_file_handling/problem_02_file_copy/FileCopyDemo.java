package chapter12_file_handling.problem_02_file_copy;

import java.io.*;
import java.util.Scanner;

public class FileCopyDemo {
    public static void main(String[] args) {

        String sourceFilePath = "D:\\C-Documents\\GITHUB\\Mastering-Java\\src\\chapter12_file_handling\\problem_01_read_write_append\\profile.txt";
        String destinationFilePath = "D:\\C-Documents\\GITHUB\\Mastering-Java\\src\\chapter12_file_handling\\problem_02_file_copy\\profile_backup.txt";

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        try (Scanner scanner = new Scanner(sourceFile); FileWriter writer = new FileWriter(destinationFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line);
                writer.write(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
