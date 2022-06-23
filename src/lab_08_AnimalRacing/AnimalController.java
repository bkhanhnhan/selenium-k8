package lab_08_AnimalRacing;

import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        int winnerAnimal = new AnimalController().getWinnerSpeed(Arrays.asList(horse,dog,tiger));
        System.out.println("The winner is: " + winnerAnimal);
    }

    public int getWinnerSpeed(List<Animal> animalList){
        int winner = animalList.get(0);

        for (int index = 0; index < animalList.size(); index++) {
            if (animalList.get(index) > winner){
                winner = animalList.get(index);
            }
        }
        return winner;
    }


}

