package lesson_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);

        for (int index = 0; index < myArrList.size(); index++) {
            int currentNumber = myArrList.get(index);

            if (currentNumber % 2 != 0){
                myArrList.set(index, currentNumber + 1);
            }
        }
        System.out.println(myArrList);

        System.out.println(myArrList.isEmpty());
        System.out.println(myArrList.contains(2));
        System.out.println(myArrList.contains(5));
        System.out.println(myArrList.indexOf(2));
    }
}
