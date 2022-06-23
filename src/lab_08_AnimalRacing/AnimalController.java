package lab_08_AnimalRacing;

import java.util.*;

public class AnimalController {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();


        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(horse);
        animalArrayList.add(dog);
        animalArrayList.add(tiger);

        // Animal with fastest speed
        Animal getFastest = Collections.max(animalArrayList, Comparator.comparingInt(Animal::getSpeed));

        //Fastest speed
        int maxSpeed = getFastest.getSpeed();

        //Print results
        System.out.printf("Winner is %s, with speed: %d km/h", getFastest.getName().toString(), maxSpeed);
    }
}

