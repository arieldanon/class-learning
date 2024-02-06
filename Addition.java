/**
 * @author Ari Danon
 * @version 6 Feb 2024
 * This Class will demo the Scanner and add two numbers together
 */

//This is where we import classes
import java.util.Scanner;

// class declaration
public class Addition {

    // this is the method declaration
    public static void main(String[] args){

        // Create an instance of scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for first Integer
        System.out.print("Enter the first integer: ");

        // Declare integer a
        int a;

        // Get user input

        a = input.nextInt();

        // Prompt user for second Integer
        System.out.print("Enter the second integer: ");

        // Declare b
        int b;

        //Get user input

        b = input.nextInt();

        //Add the two

        int c = b + a;

        //Print the two
        System.out.printf("The sum is: %d%n", c);




    }
}
