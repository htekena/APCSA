package Chapter02;

import java.util.Scanner;

/**
 * Program to determine full amount to be paid for a meal.
 *
 * @author Tekena Harcourt
 */
public class P2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the price of meal
        System.out.print("Price of Meal: $");
        double Mealprice = input.nextDouble();

        // Get the price of drink
        System.out.print("Price of Drink: $");
        double Drinkprice = input.nextDouble();

        // Get the price of dessert
        System.out.print("Price of Dessert: $");
        double Dessertprice = input.nextDouble();

        // Sum prices together
        double Foodprice = Mealprice + Drinkprice + Dessertprice;
        System.out.println("Price of Food: $" + Foodprice);

        // Get tax amount. Multiply by .10
        double Tax = Foodprice * 0.10;
        System.out.println("Tax: $" + Tax);

        // Get tip amount. Multiply food + tax by .15
        double Tip = (Foodprice + Tax) * 0.15;
        System.out.println("Give Tip? $" + Tip);

        // Sum food, tax and tip for total cost
        double Total = Foodprice + Tax + Tip;
        System.out.println("Total Amount Due: $" + Total);

        // Display price if food. meal, tax & tip should be labelled correctly
    }

}
