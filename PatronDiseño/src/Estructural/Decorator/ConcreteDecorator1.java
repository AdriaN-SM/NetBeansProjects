package Estructural.Decorator;

public class ConcreteDecorator1 extends Decorator {

    private String propiedadNueva;

    public ConcreteDecorator1(Component componente) {
        super(componente);
    }

    public void operation() {
        super.operation();
        this.propiedadNueva = "Nueva propiedad";
        System.out.println("ConcreteDecorator1.operation()");
    }
}

