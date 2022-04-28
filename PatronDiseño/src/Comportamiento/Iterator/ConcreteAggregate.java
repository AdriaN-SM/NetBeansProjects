package Comportamiento.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ConcreteAggregate implements Aggregate {

    private List<String> names = new ArrayList<>(Arrays.asList("Robert", "John", "Julie", "Lora")); //

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(names);
    }

}
