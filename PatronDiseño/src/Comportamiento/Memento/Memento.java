package Comportamiento.Memento;

public class Memento {

    private final String state;

    public Memento(String stateToSave) {
        state = stateToSave;
    }

    String getSavedState() {
        return state;
    }

    public String getState() {
        return state;
    }


}
