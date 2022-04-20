package Estructural.Bridge;

import java.util.ArrayList;
// https://www.geeksforgeeks.org/bridge-design-pattern/
// https://refactoring.guru/design-patterns/bridge
public abstract class Abstraction {

    protected String name;
    protected ArrayList<Implementor> implementorList = new ArrayList<>();

    public Abstraction(String name) {
        this.name = name;
    }

    public Boolean add(Implementor imp) {
        return implementorList.add(imp);
    }

    public Boolean remove(Implementor imp) {
        return implementorList.remove(imp);
    }

    abstract public void doSomething();
}
