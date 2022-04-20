package Comportamiento.Memento;

public class MainMemento {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.set("State1");
        originator.set("State2");
        caretaker.addState(originator.saveToMemento());
        originator.set("State3");

        caretaker.addState(originator.saveToMemento());
        originator.set("State4");
        caretaker.addState(originator.saveToMemento());

        originator.restoreFromMemento(caretaker.getSavedState(0));
        originator.restoreFromMemento(caretaker.getSavedState(1));
        originator.restoreFromMemento(caretaker.getSavedState(2));
    }

}
