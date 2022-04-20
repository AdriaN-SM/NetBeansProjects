
package Estructural.Proxy;

public class RealSubject implements Subject{
    
    private String name;

    public RealSubject(String name) {
        this.name = name;
        load();
    }
    
    private void load(){
        System.out.println("Loading " + name);
    }

    @Override
    public void doSomething() {
        System.out.println(name + " is doing something");
    }
    
}
