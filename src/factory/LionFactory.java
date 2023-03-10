package factory;

import animal.Animal;
import animal.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionFactory {
    public static ArrayList<Lion> createLionsList(int lionCount) {
        ArrayList<Lion> lionsList= new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            Lion li = new Lion(new Random().nextInt(10), new Random().nextInt(10), 4, new Random().nextInt(10));
            lionsList.add(li);
        }
        return lionsList;
    }
}
