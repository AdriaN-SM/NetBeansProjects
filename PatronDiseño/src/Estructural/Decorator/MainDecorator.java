package Estructural.Decorator;

public class MainDecorator {

    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecorator1 cd1 = new ConcreteDecorator1(cc);
        ConcreteDecoratorB cdB = new ConcreteDecoratorB(cd1);

        cdB.operation();
        
        cdB.removeDecorator(cd1);
        
        cdB.operation();
        
    }
}
