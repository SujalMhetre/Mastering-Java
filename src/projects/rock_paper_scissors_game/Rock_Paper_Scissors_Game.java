package projects.rock_paper_scissors_game;

import java.util.Scanner;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        int player;
        System.out.println("Hello there, Are you ready for the game??");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1=Rock, 2=Paper and 3=Scissors");
        player = sc.nextInt();

        int comp = (int) (Math.random() * 3) + 1;

        System.out.println("Your choosed =" + player);
        System.out.println("Computer choosed =" + comp);

        if (player >= 1 && player < 4) {
            if (player == comp) {
                System.out.println("Draw!!!");
            } else if ((player == 1 && comp == 3) ||
                    (player == 2 && comp == 1) ||
                    (player == 3 && comp == 2)) {
                System.out.println("You won!!");
            } else {
                System.out.println("You lost !!!");
            }
        } else {
            System.out.println("Error, Enter a valid number");
        }
    }
}
