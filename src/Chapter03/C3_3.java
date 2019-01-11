package Chapter03;

import java.util.Scanner;

/**
 * Program to play "Rock, Paper, Scissors"
 *
 * @author Tekena Harcourt
 */
public class C3_3 {

    /**
     * Main methods
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rng = (int) (Math.random() * 3);
        System.out.println("Scissors is zero, rock is 1, paper is 2");
        System.out.print("What do you pick?: ");
        int player = input.nextInt();
        System.out.print("The computer is ");
        switch (rng) {

            case 0:
                System.out.println("scissors.");
                break;
            case 1:
                System.out.println("rock.");
                break;
            case 2:
                System.out.println("paper.");
                break;
        }
        System.out.print("You picked ");
        switch (player) {

            case 0:
                System.out.println("scissors.");
                break;
            case 1:
                System.out.println("rock.");
                break;
            case 2:
                System.out.println("paper.");
                break;
        }
        if (rng == player) {
            System.out.print("Draw");
        } else {
            boolean win = (player == 0 && rng == 2)
                    || (player == 1 && rng == 0)
                    || (player == 2 && rng == 1);
            if (win) {
                System.out.print("You Win!!");
            } else {
                System.out.print("You Loose.");
            }

        }

    }

}
