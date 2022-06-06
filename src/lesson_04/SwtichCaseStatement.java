package lesson_04;

import java.util.Scanner;

public class SwtichCaseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int userInput = scanner.nextInt();

//        if (userInput == 1){
//            System.out.println("Giai nhat");
//        } else if (userInput == 2) {
//            System.out.println("Giai nhi");
//        } else if (userInput == 3) {
//            System.out.println("Giai ba");
//        } else{
//            System.out.println("Chuc ban may man lan sau");
//        }

        switch (userInput){
            case 1:
                System.out.println("Giai nhat");
                break;
            case 2:
                System.out.println("Giai nhi");
                break;
            case 3:
                System.out.println("Giai ba");
                break;
            default:
                System.out.println("Chuc ban may man lan sau");
        }
    }
}
