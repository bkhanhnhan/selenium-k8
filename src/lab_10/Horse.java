package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }
    @Override
    public int speed() {
        return new SecureRandom().nextInt(75);
    }
}
