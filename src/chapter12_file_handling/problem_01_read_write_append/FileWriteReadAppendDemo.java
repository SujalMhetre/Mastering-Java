package chapter12_file_handling.problem_01_read_write_append;

import java.io.*;
import java.util.Scanner;

public class FileWriteReadAppendDemo {
    public static void main(String[] args) {

        String filePath = "D:\\C-Documents\\GITHUB\\Mastering-Java\\src\\chapter12_file_handling\\problem_01_read_write_append\\profile.txt";

        File myFile = new File(filePath);

        //Write
        try (FileWriter writer = new FileWriter(myFile)) {
            writer.write("""
                    Name: Sujal Mhetre
                    Role: Java Developer (Fresher)
                    Focus: Core Java + DSA
                    Location: Pune
                    """);
        } catch (IOException e) {
            System.out.println("Something Went Wrong!!");
        }

        //Read
        try (Scanner scanner = new Scanner(myFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file!");
        }

        //Append
        try (FileWriter writer = new FileWriter(myFile, true)) {
            writer.write("Learning Java File Handling");
        } catch (IOException e) {
            System.out.println("Something Went Wrong!!");
        }

        //Read Original + append
        try (Scanner scanner = new Scanner(myFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file!");
        }


    }
}
