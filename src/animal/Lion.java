package animal;

import animal.Animal;

import java.text.Format;

public class Lion extends Animal implements Comparable<Lion> {
    private int grivaVolume;
    private static final int MAX_WEIGHT = 10;
    private static final String TYPE = "lion";
    public void setGrivaVolume(int grivaVolume) {
        this.grivaVolume = grivaVolume;
    }

    public int getGrivaVolume() {
        return grivaVolume;
    }

    public Lion(int old, int weight, int numberOfLegs, int grivaVolume) {
        super(old, weight, numberOfLegs);
        this.grivaVolume = grivaVolume;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public void feed(int foodWeight) {
        super.feed(foodWeight);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "grivaVolume=" + grivaVolume +
                ", old=" + old +
                ", weight=" + weight +
                '}';
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int compareTo(Lion o) {
        if(this.old > o.old ) {
            return 1;
        } else if (this.old < o.old) {
            return -1;
        }
        return 0;
        }
    }




