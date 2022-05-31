package lesson_03;

import javax.swing.*;

public class ArrayLearning {

    public static void main(String[] args) {
        int arrayLength = 7;
        int[] myIntArray = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = index + 1;
        }

        for (int index = 0; index < myIntArray.length; index++) {
            System.out.printf("Element at the index %d has value %d\n",index,myIntArray[index]);
        }
    }
}
