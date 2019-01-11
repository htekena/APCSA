package Chapter03;

import java.util.Scanner;

/**
 * Program to determine if a number is a palindrome
 *
 * @author Tekena Harcourt
 */
public class C3_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter input integer
        System.out.print("Enter a three-digit integer: ");
        int number1 = input.nextInt();

        if ((number1 / 100) == (number1 % 10)) {
            System.out.println(number1 + " is a palindrome");
        } else {
            System.out.println(number1 + " is not a palindrome");

        }

    }
}
