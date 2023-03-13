package comparator;

import animal.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getOld(), o2.getOld());
    }
}
