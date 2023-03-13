import animal.Lion;
import animal.Wolf;
import animalUtils.AnimalUtils;
import cage.LionCage;
import cage.WolfCage;
import factory.LionFactory;
import factory.WolfFactory;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int lionCount = 50;
        LionCage cage = new LionCage();
//        cage.setAnimalsInCage(LionFactory.createLionsList(lionCount));
//
//
//        System.out.println("start");
//        System.out.println(cage.getAllAnimalsInCage());
//        System.out.println();
//        System.out.println("sorted");
//        Collections.sort(cage.getAllAnimalsInCage());
//        System.out.println(cage.getAllAnimalsInCage());
//        System.out.println();
//        System.out.println("sortedByGriva");
//        cage.sortLionsByGriva();
//        System.out.println(cage.getAllAnimalsInCage());

        int wolfCount = lionCount;
        WolfCage cage2 = new WolfCage();
        cage2.setAnimalsInCage(WolfFactory.createWolfsList(wolfCount));


        System.out.println("start");
        System.out.println(cage2.getAllAnimalsInCage());
        System.out.println();
        System.out.println("sortedByOld");
        AnimalUtils.sortAnimals(cage2.getAllAnimalsInCage());
//        Collections.sort(cage2.getAllAnimalsInCage());
        System.out.println(cage2.getAllAnimalsInCage());
//        System.out.println();
//        System.out.println("sortedWeightAndOld");
//        cage2.sortWolfsByWeightAndOld();
//        System.out.println(cage2.getAllAnimalsInCage());
    }

}
