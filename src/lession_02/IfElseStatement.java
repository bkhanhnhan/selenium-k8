package lession_02;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input arrival time: ");
        int arrivalTime = scanner.nextInt();

        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("Dat xe ra");
        System.out.println("Chay toi quan");
 //       if (isHeOnTime){
 //           System.out.println("Let's talk");
 //       } else {
 //           System.out.println("Write a letter");
 //       }

 //       System.out.println("Dat xe ra");
 //       System.out.println("Chay ve nha");

        //
        String msg = isHeOnTime ? "Let's talk" : "Write a letter";
        System.out.println(msg);
        System.out.println("Dat xe ra");
        System.out.println("Chay ve nha");

    }
}
