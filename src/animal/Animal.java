package animal;

public abstract class Animal {

    protected int old;
    protected int weight;
    protected int numberOfLegs;

    public void setOld(int old) {
        this.old = old;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getOld() {
        return old;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public Animal(int old, int weight, int numberOfLegs) {
        this.old = old;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public abstract int getMaxWeight();

    public void feed(int foodWeight){
        this.weight += foodWeight;
        if (this.weight > getMaxWeight()) {
            System.out.printf("Превышен максимальный вес d%", this.weight);
            weight = getMaxWeight();
        }
    }

    public abstract String getType();

}
