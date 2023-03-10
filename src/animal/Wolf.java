package animal;

public class Wolf extends Animal implements Comparable<Wolf>{

    private static final int MAX_WEIGHT = 10;
    private static final String TYPE = "wolf";
    public Wolf(int old, int weight, int numberOfLegs) {
        super(old, weight, numberOfLegs);
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }


    @Override
    public int compareTo(Wolf o) {
        if(this.old > o.old ) {
            return 1;
        } else if (this.old < o.old) {
            return -1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Wolf{" +
                " old=" + old +
                ", weight=" + weight +
                '}';
    }
}
