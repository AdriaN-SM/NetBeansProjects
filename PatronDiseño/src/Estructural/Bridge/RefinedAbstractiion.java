
package Estructural.Bridge;


public class RefinedAbstractiion extends Abstraction{

    public RefinedAbstractiion(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("Refinacion de abstraction " + name);
        for(Implementor imp : implementorList){
            imp.method();
        }
    }
    
    
    
}
