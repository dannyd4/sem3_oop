package cage;

import animal.Animal;
import animal.Lion;
import animal.Wolf;
import comparator.LionComparator;
import comparator.WolfComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WolfCage implements AnimalCage {


    private int garbage;
    private int foodInCage;
    private ArrayList<Wolf> animalsInCage;

    public WolfCage() {
        this.animalsInCage = new ArrayList<Wolf>();
    }

    public int getAnimalsInCage() {
        return animalsInCage.size();
    }

    public ArrayList<Wolf> getAllAnimalsInCage() {
        return this.animalsInCage;
    }

    @Override
    public int addAnimalToCage(Animal newWolf) {
        if (newWolf instanceof Wolf) {
            this.animalsInCage.add((Wolf) newWolf);
        }
        return this.animalsInCage.size();
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
        if (getAnimalsInCage() == 0) {
            System.out.println("В клетке нет животных!");
            return null;
        }
        for (int i = 0; i < animalsInCage.size(); i++) {
            if (animalsInCage.get(i) != null) {
                return animalsInCage.get(i);
            }
        }
        return null;
    }

    public void sortWolfsByWeightAndOld() {

        Collections.sort(animalsInCage, new WolfComparator());
    }

    public void setAnimalsInCage(ArrayList<Wolf> wolfsList) {
        this.animalsInCage = wolfsList;
    }
}
