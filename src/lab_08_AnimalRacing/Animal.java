package lab_08_AnimalRacing;

import java.security.SecureRandom;

public class Animal {

    public static void main(String[] args) {
        int random = new SecureRandom().nextInt(50);
        System.out.println(random);
    }
}
