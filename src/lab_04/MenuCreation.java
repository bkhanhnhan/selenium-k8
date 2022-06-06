package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCreation {

    public static void main(String[] args) {

        boolean isContinuing = true ;
        printMenu();
        while(isContinuing == true){

            int userOption = getUserInput();
            List<Integer> myList = new ArrayList<>();

            for (int index = 0; index < 10; index++) {
                int randomNumber = getRandomNumber(1000);
                myList.add(index,randomNumber);
            }
            if(userOption == 5){
                isContinuing = false;
            } else if (userOption == 1) {
                System.out.println("Your numbers: " + myList);
            } else if (userOption == 2) {
                System.out.println("Maximum number is: " + getMaximumNumber(myList));
            } else if (userOption == 3) {
                System.out.println("Minimum number is: " + getMinimumNumber(myList));
            } else if (userOption == 4) {
                int findNumber = getInputNumber();
                boolean isInList = false;

                for (int index = 0; index < myList.size(); index++) {
                    if (findNumber == myList.get(index)){
                        isInList = true;
                        System.out.printf("Number %d is in the list at index %d\n",findNumber,index);
                    }
                }
                if (isInList == false){
                    System.out.printf("Number %d is not in the list\n",findNumber);
                }
            } else{
                System.out.println("Wrong number!");
            }
        }
        System.out.println("See you again!");
    }

    private static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number to find: ");
        return scanner.nextInt();
    }

    private static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit!");
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        return scanner.nextInt();
    }

    public static int getRandomNumber(int boundaryNumber){
        int randomNumber = new SecureRandom().nextInt(boundaryNumber);
        return randomNumber;
    }

    public static int getMaximumNumber(List<Integer> list){
        int maxValue = list.get(0);

        for (int index = 0; index < list.size(); index++) {
            if(list.get(index) > maxValue){
                maxValue = list.get(index);
            }
        }
        return maxValue;
    }

    public static int getMinimumNumber(List<Integer> list){
        int minValue = list.get(0);

        for (int index = 0; index < list.size(); index++) {
            if(list.get(index) < minValue){
                minValue = list.get(index);
            }
        }
        return minValue;
    }
}
