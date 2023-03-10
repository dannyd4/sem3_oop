package comparator;

import animal.Wolf;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {

    @Override

    /**
     * /
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     * Сначала сравнение идёт по весу и если веса равны, то идёт сравнение по возрасту.
     */
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else {
            if (o1.getOld() > o2.getOld()) {
                return 1;
            } else if (o1.getOld() < o2.getOld()) {
                return -1;
            }
        }
        return 0;
    }


}

