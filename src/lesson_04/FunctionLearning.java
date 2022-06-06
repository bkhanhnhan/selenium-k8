package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {

        sayHello("Teo", 12);
        sayHello("Ti", 22 );
        sayHello("Tun", 24);

        System.out.println(getRandomNumber(10));
        System.out.println(getRandomNumber(100));

        printNumber();
    }
    public static void sayHello(String name, int age ){

        System.out.println("Hello" + name + age);
    }

    public static int getRandomNumber(int boundaryNumber){
        int randomNumber = new SecureRandom().nextInt(boundaryNumber + 10);
        return randomNumber;
    }

    public static void printNumber(){
        for (int number = 0; number < 5; number++) {
            if (number == 3){
                return;
            }
            System.out.println(number);
        }
        System.out.println("End");
    }
}
