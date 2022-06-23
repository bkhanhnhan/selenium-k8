package lab_08_AnimalRacing;

import java.security.SecureRandom;

public class Dog extends Animal {

    private int randomSpeed = new SecureRandom().nextInt(60);
    private String name = "Dog";

    public Dog(){
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