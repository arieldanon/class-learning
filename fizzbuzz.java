/**
 * @author arieldanon
 * @version 8 Feb 2024
 * This program will demonstrate nested control with the game FizzBuzz
 */


public class fizzbuzz {
    public static void main(String[] args){

        int fizzbuzz = 1;

        while (fizzbuzz <= 30){

            if ((fizzbuzz % 3 == 0) && (fizzbuzz % 5 == 0)){
                System.out.println("FizzBuzz");

            } else if (fizzbuzz % 3 == 0){

                System.out.println("Fizz");

            } else if (fizzbuzz % 5 == 0){

                System.out.println("Buzz");

            } else{
                System.out.println(fizzbuzz);
            }
        fizzbuzz++;
        }
    }
}
