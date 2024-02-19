/**
 * @author arieldanon
 * @version 19 Feb 2024
 * This program will take user input of a cost of an item, and the input of the amount paid, outputting
 * the least amount of bills to pay back
 */


import java.util.Scanner;
public class MakeBills {
    public static void main(String[] args) {

        // Create an instance of input to get user input
        Scanner input = new Scanner(System.in);

        // Get the cost of the item
        System.out.println("Enter the cost of the item (an integer < $100) : ");
        int cost = input.nextInt();

        // Get the amount they're paying

        System.out.println("Enter the amount you're paying (an integer and greater than cost <$100) : ");
        int paid = input.nextInt();

        // While the amount paid is less than the cost, loop again, if it is greater, get out the loop

        while (paid < cost) {
            System.out.println("Enter the amount you're paying (an integer and greater than cost) : ");
            paid = input.nextInt();
            if (paid > cost) {
                break;
            }
        }

        // If paid is greater than the cost use this loop

            // Get the difference in the 2 amounts
        int difference = paid - cost;

        System.out.printf("The difference is: %d%n ",difference);

            // Use divison with integer to figure out how many of 50s to use
        int fifties = difference/50;
        if (fifties > 0){
            System.out.printf("Fifties: %d%n", fifties);
        }
            // Update the difference using modulo
        difference = difference % 50;

            // Use divison with integer to figure out how many of 20s to use
        int twenties = difference/20;
        if (twenties > 0){
            System.out.printf("Twenties: %d%n", twenties);
        }
            // Update the difference using modulo
        difference = difference % 20;

            // Use divison with integer to figure out how many of 10s to use
        int tens = difference/10;
        if (tens > 0){
            System.out.printf("Tens: %d%n", tens);
        }
            // Update the difference using modulo
        difference = difference % 10;

            // Use divison with integer to figure out how many of 5s to use
        int fives = difference/5;
        if (fives > 0){
            System.out.printf("Fives: %d%n", fives);
        }
            // Update the difference using modulo
        difference = difference % 5;

            // Use divison with integer to figure out how many of ones to use
        int ones = difference;
        if (ones > 0){
            System.out.printf("Ones: %d%n", ones);
        }

        // Use ifs statements to determine which variables have a value to print


    }
}
