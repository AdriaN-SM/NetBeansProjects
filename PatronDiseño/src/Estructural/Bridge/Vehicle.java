package Estructural.Bridge;

import java.util.ArrayList;
/* 
   Abstraction 

   https://www.geeksforgeeks.org/bridge-design-pattern/
   https://www.tutorialspoint.com/design_pattern/bridge_pattern.   
   https://refactoring.guru/design-patterns/bridge
   https://www.ennicode.com/bridge-design-pattern/
*/

public abstract class Vehicle {

    protected String name;
    protected ArrayList<PaintShop> implementorList = new ArrayList<>();

    public Vehicle(String name) {
        this.name = name;
    }

    public Boolean add(PaintShop imp) {
        return implementorList.add(imp);
    }

    public Boolean remove(PaintShop imp) {
        return implementorList.remove(imp);
    }

    abstract public void applyChange();
}
