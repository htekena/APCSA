package Chapter02;

import java.util.Scanner;

/**
 * Program to determine average acceleration
 *
 * @author Tekena Harcourt
 */
public class C2_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input  
        System.out.print("Enter v0, v1 and t: ");
        double V0 = input.nextDouble();
        double V1 = input.nextDouble();
        double t = input.nextDouble();

        // Set up formula
        double Acceleration = (V1 - V0) / t;

        //Display output
        System.out.print("The average acceleration is " + Acceleration);
    }

}
