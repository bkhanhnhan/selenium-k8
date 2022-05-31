package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {

        boolean isContinuing = true;

        while (isContinuing) {
            System.out.println("=====Game Menu=====");
            System.out.println("1. Generate a number");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select option: ");
            int option = scanner.nextInt();

            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.println("Your randon number is: " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("Wrong input!");
            }

        }
        System.out.println("See you again!");
    }
}
