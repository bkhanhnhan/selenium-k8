package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
        public static void main(String[] args) {
                Animal tiger = new Animal.Builder()
                        .setName("Tiger")
                        .setSpeed(new SecureRandom().nextInt(100))
                        .setWithWings(false)
                        .build();
                Animal snake = new Animal.Builder()
                        .setName("Snake")
                        .setSpeed(new SecureRandom().nextInt(40))
                        .setWithWings(false)
                        .build();
                Animal bird = new Animal.Builder()
                        .setName("Bird")
                        .setSpeed(new SecureRandom().nextInt(60))
                        .setWithWings(true)
                        .build();
                Animal dog = new Animal.Builder()
                        .setName("Dog")
                        .setSpeed(new SecureRandom().nextInt(60))
                        .setWithWings(false)
                        .build();
                Animal falcon = new Animal.Builder()
                        .setName("Falcon")
                        .setSpeed(new SecureRandom().nextInt(65))
                        .setWithWings(true)
                        .build();
                Animal raven = new Animal.Builder()
                        .setName("Raven")
                        .setSpeed(new SecureRandom().nextInt(65))
                        .setWithWings(true)
                        .build();
                new TestAnimal().getAnimalWinner(Arrays.asList(tiger, dog, snake, falcon, raven, bird));
    }
}

