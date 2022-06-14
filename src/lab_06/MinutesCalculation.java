package lab_06;

import java.util.Arrays;
import java.util.Scanner;

public class MinutesCalculation {

    public static void main(String[] args) {

        String inputStr = "2 hours and 5 minutes";

        //Split hour and minute part
        String[] splitStr = inputStr.split("and",0);

        //Calculate
        int getHour = Integer.parseInt(splitStr[0].replaceAll("[^0-9]",""));
        int getMinute = Integer.parseInt(splitStr[1].replaceAll("[^0-9]",""));
        System.out.println("Total Minutes: " + ((getHour * 60) + getMinute));

    }
}
