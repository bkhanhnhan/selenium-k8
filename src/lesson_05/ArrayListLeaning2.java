package lesson_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListLeaning2 {
    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(6);
        myArrList.add(6);
        myArrList.add(3);
        myArrList.add(5);
        myArrList.add(2);
        myArrList.add(6);

        List<Integer> withoutDuplicateNumbers = new ArrayList<>();

        for (Integer value : myArrList) {
            if (!withoutDuplicateNumbers.contains(value)){
                withoutDuplicateNumbers.add(value);
            }
        }
        System.out.println(myArrList);
        System.out.println(withoutDuplicateNumbers);

        Set<Integer> set = new HashSet<>(myArrList);
        List<Integer> setArrayList = new ArrayList<>(set);
        System.out.println(setArrayList);

        List<Integer> first3MinValues = setArrayList.subList(0,3);
        System.out.println(first3MinValues);
    }
}
