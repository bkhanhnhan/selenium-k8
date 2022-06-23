package lab_08_AnimalRacing;

import java.security.SecureRandom;

public class Tiger extends Animal {

    private int randomSpeed = new SecureRandom().nextInt(100);
    private String name = "Tiger";

    public Tiger(){
        this.name = name;
        this.speed = randomSpeed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
