package Chapter04;

import java.util.Scanner;

/**
 * Program to highest bidder
 *
 * @author Tekena Harcourt
 */
public class P4 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The details asked below concern the first bidder");

        // Get name of first bidder
        System.out.print("Name: ");
        String firstBidName = input.next();

        // get hours of work for first bidder and store as int
        System.out.print("Hours: ");
        byte firstBidHour = input.nextByte();

        // get hourly charge of first bidder and store as double
        System.out.print("Rate per hour: $");
        double firstBidRate = input.nextDouble();

        System.out.println("The details asked below concern the second bidder");

        // get name of second bidder
        System.out.print("Name: ");
        String secondBidName = input.next();

        // get hours of work for the second bidder and store as int
        System.out.print("Hours: ");
        byte secondBidHour = input.nextByte();

        // get hourly charge of the second bidder and store as double
        System.out.print("Rate per hour: $");
        double secondBidRate = input.nextDouble();

        //calculate first cost for both (hour * rate)
        double firstBidCost = firstBidHour * firstBidRate;

        double secondBidCost = secondBidHour * secondBidRate;

        System.out.println("--Bid Winner--");
        // Choosing the winner
        if (firstBidCost < secondBidCost) {
            System.out.println("Winner: " + firstBidName);
            System.out.printf("Total Cost: $%.2f", firstBidCost);
        } else if (secondBidCost < firstBidCost) {
            System.out.println("Winner: " + secondBidName);
            System.out.printf("Total Cost: $%.2f", secondBidCost);
        } else if ((firstBidCost == secondBidCost) && (firstBidHour < secondBidHour)) {
            System.out.println("Winner: " + firstBidName);
            System.out.printf("Total Cost: $%.2f", firstBidCost);
            System.out.println("");
            System.out.println("Hours: " + firstBidHour);
        } else if ((firstBidCost == secondBidCost) && (secondBidHour < firstBidHour)) {
            System.out.println("Winner: " + secondBidName);
            System.out.printf("Total Cost: $%.2f", secondBidCost);
            System.out.println(" ");
            System.out.println("Hours: " + secondBidHour);
        } else if ((firstBidCost == secondBidCost) && (firstBidHour == secondBidHour)) {
            System.out.printf("Both %s and %s have identical bids with %d "
                    + "hours at a rate of $%.2f per hour"
                    + ".", firstBidName, secondBidName, firstBidHour, secondBidRate);
        }
    }
}
