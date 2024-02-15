/**
 * @author arieldanon
 * @version 15 Feb 2024
 * This will display the 12 days of christmas based on a chosen day using switch statements
 */

import java.util.Scanner;


public class Christmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Which day of Christmas is it?: ");

        int day = input.nextInt();

        System.out.printf("On the %d day of Christmas, my true love gave to me:%n", day);
        switch (day){
            case 12:
                System.out.printf("Twelve Ladies Dancing %n");
            case 11:
                System.out.printf("Eleven lord a-leaping %n");
            case 10:
                System.out.printf("Ten Drummers Drumming %n");
            case 9:
                System.out.printf("Nine Pipers piping %n");
            case 8:
                System.out.printf("Eight maids-a-milking %n");
            case 7:
                System.out.printf("Seven swans-a-swimming %n");
            case 6:
                System.out.printf("Six geese-a-layin %n");
            case 5:
                System.out.printf("Five golden rings %n");
            case 4:
                System.out.printf("Four collie birds %n");
            case 3:
                System.out.printf("Three french hens %n");
            case 2:
                System.out.printf("Two turtle doves %n");
            case 1:
                System.out.printf("Partridge in a pair tree!!!!! %n");
                break;
            default:
                System.out.print("No christmas song for you mothafucka.");
                break;

        }
    }
}
