package Chapter04;

import java.util.Scanner;

/**
 * Program to compute tax rate
 *
 * @author Tekena Harcourt
 */
public class C4_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee's name: ");
        String eName = input.next();

        System.out.print("Enter number of hours worked: ");
        int hours = input.nextInt();

        System.out.print("Enter hourly pay rate: $");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter federal tax witholding rate: ");
        double fedRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();
        System.out.println(" ");

        double payRate = hours * hourlyRate;
        System.out.println("Employee Name: " + eName);
        System.out.println("Hour Worked:" + hours);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Gross Pay: $" + payRate);
        System.out.println("Deductions: ");

        double fedPercentRate = fedRate * 100;
        double fedRateOutput = fedRate * payRate;

        System.out.printf("    Federal Withholding (%.2f):"
                + "$%.2f \n", fedPercentRate, fedRateOutput);

        double statePercentRate = stateRate * 100;
        double stateRateOutput = stateRate * payRate;

        System.out.printf("    State Withholding (%.2f):"
                + "$%.2f \n", statePercentRate, stateRateOutput);

        double totalDeduction = fedRateOutput + stateRateOutput;

        System.out.printf("    Total Deduction: $%.2f \n", totalDeduction);

        double finalOutput = payRate - totalDeduction;
        System.out.printf("Net Pay: $%.2f", finalOutput);
    }
}
