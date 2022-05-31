package lab_03;

public class NumberCounting {

    public static void main(String[] args) {
        int[] intArray = {0,123,90,85,52,57,68,70};
        int evenNumber = 0;
        int oddNumber = 0;

        for (int index = 0; index < intArray.length; index++) {
            if(intArray[index] % 2 == 0){
                evenNumber = evenNumber + 1;
            }else {
                oddNumber = oddNumber + 1;
            }
        }
        System.out.println("Total even number: " + evenNumber);
        System.out.println("Total odd number: " + oddNumber);
    }
}
