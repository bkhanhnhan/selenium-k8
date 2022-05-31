package lab_03;

public class MaxMinValue {

    public static void main(String[] args) {

        int[] intArray = {1,3,10,15,9,0};
        int minValue = intArray[0];
        int maxValue = intArray[0];

        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] > maxValue){
                maxValue = intArray[index];
            }else if (intArray[index] < minValue){
                minValue = intArray[index];
            }
        }
        System.out.println("Max value is: " + maxValue);
        System.out.println("Min value is: " + minValue);
    }
}
