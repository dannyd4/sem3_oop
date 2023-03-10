package iterators;

import animal.Wolf;

import java.util.Iterator;
import java.util.List;

public class WolfIterator implements Iterator {
    private List<Wolf> wolfList;
    private int cursor;

    public WolfIterator(List<Wolf> wolfList) {
        this.wolfList = wolfList;
    }

    @Override
    public boolean hasNext() {
        return cursor < wolfList.size();
    }

    @Override
    public Object next() {
        return wolfList.get(cursor++);
    }
}
