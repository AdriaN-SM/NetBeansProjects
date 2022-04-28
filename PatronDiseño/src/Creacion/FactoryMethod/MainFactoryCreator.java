package Creacion.FactoryMethod;

public class MainFactoryCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Creator creator1 = new ConcreteCreator1();
        Product producto1 = creator1.factoryMethod();
        producto1.operacion();
        Creator creator2 = new ConcreteCreator2();
        Product producto2 = creator2.factoryMethod();
        producto2.operacion();
        
        
        
        Creator creator = new ConcreteCreator1();
        Product producto = creator.factoryMethod(1);
        producto.operacion();
        producto = creator.factoryMethod(2);
        producto.operacion();

    }

}
