/**
 * @author arieldanon
 * @version 15 Feb 2024
 * This program will demonstrate the switch statement
 */

import java.util.Scanner;

public class switchstatement {

    public static void main(String[] args) {

        // create an instance of the scanner
        Scanner input = new Scanner(System.in);

        // prompt the user

        System.out.print("Enter in case A, B, or C: ");

        // declare string variable and get user input
        String x = input.nextLine();

        // declare our switch statement

        switch (x){

            case "A":
                System.out.println("You have chosen case A");
                break;
            case "B":
                System.out.println("You chose case B... wow");
                break;
            case "C":
                System.out.println("Case C is badaccss");
                break;
            default:
                System.out.println("You chose poorly you lil weirdo");
        }
    }
}
