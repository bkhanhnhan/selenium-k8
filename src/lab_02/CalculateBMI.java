package lab_02;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight(kg) and height(m): ");

        //Input weight
        float userWeight = scanner.nextFloat();

        //Input height
        float userHeight = scanner.nextFloat();

        //Calculate BMI
        float userBMI;
        userBMI = userWeight / (userHeight * 2);
        System.out.println(userBMI);

        //Suggest (lab 2.3)
        if (userBMI < 18.5){
            System.out.println("You're underweight!");
        } else if (userBMI < 25){
            System.out.println("Your weight is normal.");
        } else if (userBMI < 30) {
            System.out.println("You're overweight!");
        } else {
            System.out.println("You're having obesity!!");
        }
        }
    }
