/**
 * @author arieldanon
 * @version 13 Feb 2024
 */

// import Scanner

import java.util.Scanner;

public class Interest {
    public static void main(String[] args){

        // Create instance of the new scanner class
        Scanner input = new Scanner(System.in);

        //prompt the user for the principal amount
        System.out.print("How much to invest? $");

        // declare principal and assign
        double principal = input.nextDouble();

        // prompt user for interest rate
        System.out.print("What is the rate of return (As a decimal)? ");

        //declare the rate
        double rate = input.nextDouble();

        // prompt user for the number of years
        System.out.print("How many years will you hold this investment? ");

        //declare and assign the years
        int years = input.nextInt();


        // increment from 1 to the number of years
        for (int counter = 1; counter <= years; counter++) {
            System.out.printf("The amount after %d year(s) is: $%15.2f%n", counter, principal * Math.pow(1+rate, counter));
        }
        System.out.println();

    }
}
