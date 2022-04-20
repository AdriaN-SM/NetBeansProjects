
package Estructural.Decorator.Composite;

// https://en.wikipedia.org/wiki/Composite_pattern

import java.util.ArrayList;


public class Composite extends Component{
    
    private  ArrayList<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }
    
    public void add(Component component) {
        componentList.add(component);
    }
    
    public void remove(Component component) {
        componentList.remove(component);
    }
    
    
    @Override
    public void method(){
        for(Component c : componentList){
            c.method();
        }
    }
}
