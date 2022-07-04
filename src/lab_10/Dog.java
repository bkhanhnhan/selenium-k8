package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(60);
    }

}