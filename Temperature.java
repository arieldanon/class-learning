/**
 * @author arieldanon
 * @version 15 Feb 2024
 * This program will demonstrate the switch statement
 */

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        // create an instance of the scanner
        Scanner input = new Scanner(System.in);

        // prompt the user

        System.out.print("What is today's temperature");

        // declare string variable and get user input
        int temperature = input.nextInt();

        // declare our switch statement

        switch (temperature / 10){

            // Temperatures 109 - 80
            case 10:
                System.out.println("Wear shorts");
            case 9:
                System.out.println("Wear shorts!");
            case 8:
                System.out.println("Wear shorts!");
                break;

        }
    }
}
