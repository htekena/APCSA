package Chapter02;

import java.util.Scanner;

/**
 * Program to compute interest rate
 *
 * @author Tekena Harcourt
 */
public class C2_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input  
        System.out.print("Enter balance and interest rate"
                + "(e.g., 3 for 3%); ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // Set up formula
        double interest = balance * (annualInterestRate / 1200);

        //Display output
        System.out.print("The interst is " + interest);
    }
}
