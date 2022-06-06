package lab_03;

public class MinToMax {
    public static void main(String[] args) {

        int[] intArray = {1,10,4,5,6,7,5,2,0,11,23,0,14,30,1};

        for (int index = 0; index < intArray.length-1; index++) {
            for (int j = index+1; j < intArray.length; j++) {
                if(intArray[index] > intArray[j]){
                    int a = intArray[index];
                    intArray[index] = intArray[j];
                    intArray[j] = a;
                }
            }
        }
        for (int sortArray : intArray){
            System.out.printf("%d ",sortArray);
        }
    }
}
