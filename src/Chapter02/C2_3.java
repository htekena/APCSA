package Chapter02;

import java.util.Scanner;

/**
 * Program to determine the cost of driving
 *
 * @author Tekena Harcourt
 */
public class C2_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get user input  
        System.out.print("Enter distance to drive: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Set up formula
        double cost = (distance / milesPerGallon) * pricePerGallon;

        //Display output
        System.out.print("The cost of driving is " + cost);

    }
}
