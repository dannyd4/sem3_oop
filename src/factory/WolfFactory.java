package factory;

import animal.Lion;
import animal.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfFactory {
    public static ArrayList<Wolf> createWolfsList(int wolfCount) {
        ArrayList<Wolf> wolfsList= new ArrayList<>();
        for (int i = 0; i < wolfCount; i++) {
            Wolf wo = new Wolf(new Random().nextInt(10), new Random().nextInt(10), 4);
            wolfsList.add(wo);
        }
        return wolfsList;
    }
}
