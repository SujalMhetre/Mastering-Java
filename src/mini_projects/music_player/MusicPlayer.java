package  mini_projects.music_player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {

        String filePath = "D:\\C-Documents\\GITHUB\\Mastering-Java\\src\\projects\\music_player\\Millionaire.wav";

        File song = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(song); Scanner scanner = new Scanner(System.in)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("Enter your choice:");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to get resoures");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("File type not Supported");
        } catch (IOException e) {
            System.out.println("Something went Wrong");
        } finally {
            System.out.println("Bye");
        }


    }
}

