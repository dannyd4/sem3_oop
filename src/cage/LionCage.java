package cage;

import animal.Animal;
import animal.Lion;
import comparator.LionComparator;

import java.util.ArrayList;
import java.util.Collections;

public class LionCage implements AnimalCage<Lion> {

    private int garbage;
    private int foodInCage;


    private ArrayList<Lion> animalsInCage;

    public void setAnimalsInCage(ArrayList<Lion> animalsInCage) {
        this.animalsInCage = animalsInCage;
    }

    public LionCage() {
        this.animalsInCage = new ArrayList<Lion>();
    }

    public int getAnimalsInCage() {
        return animalsInCage.size();
    }

    public ArrayList<Lion> getAllAnimalsInCage() {
        return animalsInCage;
    }

    public void sortLionsByGriva() {
        Collections.sort(animalsInCage,new LionComparator());
    }

    public void sortLions() {
        Collections.sort(this.animalsInCage);
    }

    @Override
    public int addAnimalToCage(Lion newlion) {
        if (newlion instanceof Lion) {
            this.animalsInCage.add((Lion) newlion);
        }
        return this.animalsInCage.size();
    }

    @Override
    public int addFoodToCageforEvery(int food) {
        this.foodInCage += food;
        return foodInCage;
    }

    @Override
    public int cleanCage() {
        garbage = 0;
        return garbage;
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


}
