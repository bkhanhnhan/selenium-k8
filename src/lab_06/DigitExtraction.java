package lab_06;

import java.util.Scanner;

public class DigitExtraction {

    public static void main(String[] args) {

        String inputString = getInputString();
        String extractedStr = "";
        char[] myCharacters = inputString.toCharArray();

        for (char character : myCharacters) {
            if(Character.isDigit(character)){
                extractedStr = extractedStr + character;
            }
        }
        System.out.println(extractedStr);
    }

    public static String getInputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string: ");
        return scanner.nextLine();
    }
}
