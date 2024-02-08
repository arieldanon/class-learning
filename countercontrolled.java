/**
 * @author arieldanon
 * @version 7/2/24
 * Program that will
 */

import java.util.Scanner;

public class countercontrolled {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradecounter = 1;

        while (gradecounter <= 10){
            System.out.println("Enter the next grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradecounter = gradecounter + 1;

        }
        int classaverage = total / 10;
        System.out.printf("The class average is a total of:  %d%n", classaverage);
    }
}
