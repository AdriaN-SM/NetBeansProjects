package Creacion.FactoryMethod;

public class ConcreteCreator1 extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }

    @Override
    public Product factoryMethod(int i) {
        switch (i) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }
}
