package lession_02;

import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input age: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18){
            System.out.println("Khong ban");
        } else if (clientAge >= 18 && clientAge <= 55) {
            System.out.println("Unlimited");
        }else {
            System.out.println();
        }
    }
}
