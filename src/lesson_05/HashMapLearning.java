package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {

        Map<Integer, String> emergencyList =  new HashMap<>();
        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Other");
        emergencyList.put(116, "Else");

        System.out.println(emergencyList.get(113));
    }
}
