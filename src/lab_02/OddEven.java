package lab_02;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");

        //
        int inputNumber = scanner.nextInt();
        boolean checkOddEven = inputNumber % 2 == 0;

        //
        if (checkOddEven){
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }
    }
}
