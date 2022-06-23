package lab_08_AnimalRacing;

import java.security.SecureRandom;

public class Animal {

    public String name;
    public int speed;

    public Animal() {
    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int randomSpeed(){
        int randomSpeed = new SecureRandom().nextInt(50);
        return randomSpeed;
    }
}
