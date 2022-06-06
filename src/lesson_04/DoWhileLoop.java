package lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(11);
        System.out.println("Random number is: "+ randomNumber);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input a number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber){
                System.out.println("Hurray! ");
                break;
            }
            guessingTime++;
        } while (guessingTime < 3);
        System.out.println("See you again!");
    }
}

