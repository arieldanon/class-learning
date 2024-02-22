/**
 * @author arieldanon
 * @version 22 Feb 2024
 * A program that will get user input to convert F or C to the opposite
 */

import java.util.Scanner;


public class conversion {
    public static double celsius(double fahrenheit) {

        double celsius;

        return celsius = 5.0 / 9.0 * (fahrenheit - 32);

    }

    public static double fahrenheit(double celsius) {

        double fahrenheit;

        return fahrenheit = 9.0 / 5.0 * celsius + 32;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to convert from F to C (1) or C to F (2)?: ");
        int convert = input.nextInt();

        switch (convert){

            case 1:
                System.out.println("What is the current temperature? (F) : ");
                double fahrenheitgiven = input.nextDouble();
                System.out.printf("The current temperature in Celsius is: %f%n", celsius(fahrenheitgiven));
                break;
            case 2:
                System.out.println("What is the current temperature? (C) : ");
                double celsiusgiven = input.nextDouble();
                System.out.printf("The current temperature in Fahrenheit is: %f%n", fahrenheit(celsiusgiven));
                break;
            default:
                System.out.println("Please enter 1 to convert F to C or 2 to convert C to F: ");
                convert = input.nextInt();
        }
    }

}
