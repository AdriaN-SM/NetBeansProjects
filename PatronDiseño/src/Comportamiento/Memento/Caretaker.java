package Comportamiento.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> savedStates = new ArrayList<>();

    public void addState(Memento memento) {
        savedStates.add(memento);
    }

    public void removeState(Memento memento) {
        savedStates.remove(memento);
    }

    public Memento getSavedState(int i) {
        return savedStates.get(i);
    }

}
