package Comportamiento.Iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {

    private List ccList;
    private int currentPosition = 0;

    public ConcreteIterator(List ccList) {
        this.ccList = ccList;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < ccList.size();
    }

    @Override
    public void reset() {
        ccList.clear();
        currentPosition = 0;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return ccList.get(currentPosition++);
        }
        return null;
    }

}
