package animalUtils;

import animal.Animal;
import comparator.AnimalComparator;

import java.util.Collections;
import java.util.List;

public class AnimalUtils {
public static <T extends Animal> List<T> sortAnimals(List<T> animalList){
    Collections.sort(animalList, new AnimalComparator());
    return animalList;
    }
}
