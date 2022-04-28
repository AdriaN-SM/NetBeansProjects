package Creacion.Builder;

public class MainBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Director director = new Director();
        Builder ConcreteBuilder1 = new ConcreteBuilder1();
        director.setBuilder(ConcreteBuilder1);
        director.construirProduct();
        Product producto1 = director.getBuilder();
        System.out.println(producto1);
        Builder ConcreteBuilder2 = new ConcreteBuilder2();
        director.setBuilder(ConcreteBuilder2);
        director.construirProduct();
        Product producto2 = director.getBuilder();
        System.out.println(producto2);
        
    }

}
