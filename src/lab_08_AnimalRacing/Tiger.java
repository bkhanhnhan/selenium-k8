package lab_08_AnimalRacing;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public int randomSpeed(){
        int randomSpeed = new SecureRandom().nextInt(50);
        return randomSpeed;
    }

}
