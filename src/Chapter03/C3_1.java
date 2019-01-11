package Chapter03;

import java.util.Scanner;

/**
 * Program to determine the day of the week
 *
 * @author Tekena Harcourt
 */
public class C3_1 {

    /**
     * Main method
     *
     * @param args command line comments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter today's day
        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        //Enter days elepsed since after today for a future day
        System.out.print("Enter number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        //calculate todays day
        if (today <= 7) {
            switch (today % 7) {
                case 0:
                    System.out.print("Today is Sunday ");
                    break;

                case 1:
                    System.out.print("Today is Monday ");
                    break;

                case 2:
                    System.out.print("Today is Tuesday ");
                    break;

                case 3:
                    System.out.print("Today is Wednesday ");
                    break;

                case 4:
                    System.out.print("Today is Thursday ");
                    break;

                case 5:
                    System.out.print("Today is Friday ");
                    break;

                case 6:
                    System.out.print("Today is Saturday ");
                    break;

                default:
                    System.out.print("Invalid day code ");
                    break;

            }
            switch ((today = elapsedDays) % 7) {
                case 0:
                    System.out.println("and the future is Sunday");
                    break;

                case 1:
                    System.out.println("and the future is Monday");
                    break;

                case 2:
                    System.out.println("and the future is Tuesday");
                    break;

                case 3:
                    System.out.println("and the future is Wednesday");
                    break;

                case 4:
                    System.out.println("and the future is Thursday");
                    break;

                case 5:
                    System.out.println("and the future is Friday");
                    break;

                case 6:
                    System.out.println("and the future is Saturday");
                    break;

                default:
                    System.out.println("Invalid day code");
                    break;
            }
        } else {
            System.out.println("Invalid day code");
        }
    }
}
