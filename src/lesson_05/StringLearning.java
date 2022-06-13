package lesson_05;

public class StringLearning {
    public static void main(String[] args) {

        String myName = "Teo";
        String myName2 = "Teo";

        String myName3 = new String("Teo");

        String myPassword = "123PASSWORDd";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalLowerCase = 0;
        int totalUpperCase = 0;

        for (char character : myCharacters) {
            if(Character.isDigit(character)){
                totalDigits++;
            } else if (Character.isLowerCase(character)) {
                totalLowerCase++;
            } else if (Character.isUpperCase(character)) {
                totalUpperCase++;
            }
        }

        if(totalDigits > 0 && totalLowerCase > 0 && totalUpperCase > 0){
            System.out.println("You're all set!");
        }else{
            System.out.println("Incorrect Password");
        }

    }
}
