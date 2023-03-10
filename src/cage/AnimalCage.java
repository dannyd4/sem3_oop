package cage;

import animal.Animal;

public interface AnimalCage {
    int addAnimalToCage(Animal newAnimal);


    int addFoodToCageforEvery(int food);

    int cleanCage();

    Animal getAnyAnimal();


}
