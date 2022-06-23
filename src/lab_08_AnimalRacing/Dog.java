package lab_08_AnimalRacing;

import java.security.SecureRandom;

public class Dog extends Animal{

    @Override
    public int randomSpeed(){
        int randomSpeed = new SecureRandom().nextInt(50);
        return randomSpeed;
    }
}
