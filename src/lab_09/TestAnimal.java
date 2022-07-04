package lab_09;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

    public void getAnimalWinner(List<Animal> animalList){
        int maxSpeed = 0;
        List<Animal> animalCanRace = new ArrayList<>();

        //Check which animal can join the race
        for (Animal animal : animalList) {
            if(animal.isWithWings() == false){
                animalCanRace.add(animal);
            }
        }

        System.out.println("Animal can join the race is: ");
        for (Animal animal : animalCanRace) {
            System.out.println(animal.name);
        }

        //Get animal winner
        String animalWinner = String.valueOf(animalCanRace.get(0));
        for (Animal animal : animalCanRace) {
            if(animal.speed > maxSpeed){
                maxSpeed = animal.speed;
                animalWinner = animal.name;
            }else if (animal.speed == maxSpeed){
                animalWinner = animal.name;
            }
        }
        System.out.printf("Winner is %s, with speed: %d km/h", animalWinner, maxSpeed);
    }
}
