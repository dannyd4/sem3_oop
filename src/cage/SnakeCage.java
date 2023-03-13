package cage;

import animal.Animal;
import animal.Snake;

public class SnakeCage implements AnimalCage<Snake>{
    @Override
    public int addAnimalToCage(Snake newAnimal) {
        return 0;
    }

    @Override
    public int addFoodToCageforEvery(int food) {
        return 0;
    }

    @Override
    public int cleanCage() {
        return 0;
    }

    @Override
    public Animal getAnyAnimal() {
        return null;
    }
}
