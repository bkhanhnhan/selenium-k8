package lab_08_AnimalRacing;

import java.security.SecureRandom;

public class Horse extends Animal {

    private int randomSpeed = new SecureRandom().nextInt(75);
    private String name = "Horse";

    public Horse(){
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
