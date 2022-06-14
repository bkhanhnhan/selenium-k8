package lab_06;

import java.util.Scanner;

public class PasswordInput {

    public static void main(String[] args) {

        String myPassword = "password123";
        int inputTimnes = 0;

        while (inputTimnes <= 2) {
            String inputPassword = getInputPassword();
            if (!inputPassword.equals(myPassword)) {
                System.out.println("Wrong Password. Please input again!");
            } else {
                System.out.println("Success!!");
                break;
            }
            inputTimnes++;
        }
        if(inputTimnes > 2){
            System.out.println("You have input wrong password 3 times. Please try again later!");
        }
    }

    public static String getInputPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input password: ");
        return scanner.nextLine();
    }
}
