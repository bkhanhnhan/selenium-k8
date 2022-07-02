package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalController {
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

                ArrayList<Animal> animalArrayList = new ArrayList<>();
                animalArrayList.add(tiger);
                animalArrayList.add(dog);
                animalArrayList.add(snake);
                animalArrayList.add(raven);
                animalArrayList.add(falcon);
                animalArrayList.add(bird);

                //Check which animal can race
                for (int index = 0; index < animalArrayList.size(); index++) {
                      if (animalArrayList.get(index).isWithWings() == true){
                                animalArrayList.remove(index);
                                index--;
                      }
                }

                System.out.println("Animal can join the race is: ");
                for (Animal animal : animalArrayList) {
                        System.out.println(animal.name);
                }

                // Animal with fastest speed
                Animal getFastest = Collections.max(animalArrayList, Comparator.comparingInt(Animal::getSpeed));

                //Fastest speed
                int maxSpeed = getFastest.getSpeed();

                //Print results
                System.out.printf("Winner is %s, with speed: %d km/h", getFastest.getName().toString(), maxSpeed);
    }
}

