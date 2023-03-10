package animal;

public class Snake extends Animal {
    private int lengthOfBody;
    private static final int MAX_WEIGHT = 8;
    private static final String TYPE = "snake";


    public Snake(int old, int weight, int numberOfLegs, int lengthOfBody) {
        super(old, weight, numberOfLegs);
        this.lengthOfBody = lengthOfBody;
    }

    public int getLengthOfBody() {
        return lengthOfBody;
    }

    public void setLengthOfBody(int lengthOfBody) {
        this.lengthOfBody = lengthOfBody;
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
    public String getType() {
        return TYPE;
    }


}
