package Estructural.Decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component componente) {
        super(componente);
    }

    public void operation() {
        super.operation();
        this.nuevoMethod();
        System.out.println("ConcreteDecoratorB.operation()");
    }
    
    public void nuevoMethod(){
        System.out.println("ConcreteDecoratorB.nuevoMethod()");
    }
}
