
package Estructural.Decorator.Composite;


public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }
    
    @Override
    public void method(){
        System.out.println("Metodo de " + name);
    }
}
