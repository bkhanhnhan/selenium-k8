package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(100);
    }
}
