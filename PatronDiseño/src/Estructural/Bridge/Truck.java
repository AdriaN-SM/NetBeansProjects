
package Estructural.Bridge;


/*
 * RefinedAbstractiion
*/

public class Truck extends Vehicle{

    public Truck(String name) {
        super(name);
    }

    @Override
    public void applyChange() {
        System.out.println("Refination of abstraction " + name);
        for(PaintShop imp : implementorList){
            imp.doWork();
        }
    }  
    
}
