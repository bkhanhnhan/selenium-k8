package lab_10;

import java.util.*;

public class AnimalController {

    public void getAnimalWinner(List<Animal> animalList){
        int maxSpeed = 0;

        //Get animal winner
        String animalWinner = String.valueOf(animalList.get(0));
        for (Animal animal : animalList) {
            if(animal.speed() > maxSpeed){
                maxSpeed = animal.speed();
                animalWinner = animal.getName();
            }else if (animal.speed() == maxSpeed){
                animalWinner = animal.getName();
            }
        }
        System.out.printf("Winner is %s, with speed: %d km/h", animalWinner, maxSpeed);
    }
    public static void main(String[] args) {
        Animal horse = new Horse("Horse");
        Animal tiger = new Tiger("Tiger");
        Animal dog = new Dog("Dog");
        new AnimalController().getAnimalWinner(Arrays.asList(horse, tiger, dog));
    }
}

