package Chapter04;

import java.util.Scanner;

/**
 * Program to determine a persons grade and major
 *
 * @author Tekena Harcourt
 */
public class C4_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters:");
        String course = input.next().toUpperCase();
        char first = course.charAt(0);
        char second = course.charAt(1);

        if ((second != '1') && (second != '2') && (second != '3') && (second != '4')) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        if (first == 'M') {
            System.out.print("Mathematics ");
        } else if (first == 'C') {
            System.out.print("Computer Science");
        } else if (first == 'I') {
            System.out.print("Information Technology");
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        if (second == '1') {
            System.out.println("Freshman");
        } else if (second == '2') {
            System.out.println("Sophomore");
        } else if (second == '3') {
            System.out.println("Junior");
        } else if (second == '4') {
            System.out.print("Senior");
        } else {
            System.out.println("Invalid input");
        }

    }
}
