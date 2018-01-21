package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String item1, item2, item3;
        int quantity1, quantity2, quantity3;
        float cost1, cost2, cost3;
        float total;

        out.println("Please list three items on your grocery shopping list.");
        out.println("Item 1?");
        item1 = keyboard.nextLine();
        out.println("Item 2?");
        item2 = keyboard.nextLine();
        out.println("Item 3?");
        item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        out.println("How many " + item1 + "?");
        quantity1 = keyboard.nextInt();
        out.println("How many " + item2 + "?");
        quantity2 = keyboard.nextInt();
        out.println("How many " + item3 + "?");
        quantity3 = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        out.println("How much does one " + item1 + " cost?");
        cost1 = keyboard.nextFloat();
        out.println("How much does one " + item2 + " cost?");
        cost2 = keyboard.nextFloat();
        out.println("How much does one " + item3 + " cost?");
        cost3 = keyboard.nextFloat();

        total = quantity1 * cost1 + quantity2 * cost2 + quantity3 * cost3;
        out.println("Calculating your grocery bill.");
        out.println("Your total cost is " + total );

    }
}
