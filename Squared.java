/**
 * @author arieldanon
 * @version 6 Feb 2024
 * This program takes an integer from user and square it
 */

import java.util.Scanner;

public class Squared {
    public static void main(String[] args){

        // Initialize scanner input variable

        Scanner input = new Scanner(System.in);

        // Get user input with the integer "get

        System.out.println("Enter the integer you want to square: ");

        int get;

        get = input.nextInt();

        // Declare squared as the integer multiplied by itself

        int squared = get * get;

        // Print the user input and square

        System.out.printf("The square of %d is: %d%n", get, squared);


    }
}
