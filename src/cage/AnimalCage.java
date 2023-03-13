package cage;

import animal.Animal;

public interface AnimalCage<T extends Animal> {
    int addAnimalToCage(T newAnimal);


    int addFoodToCageforEvery(int food);

    int cleanCage();

    Animal getAnyAnimal();


}
