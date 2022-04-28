package Creacion.Builder;

public class ConcreteBuilder1 extends Builder {

    public ConcreteBuilder1() {
        super.product = new Product();
    }

    @Override
    void buildName() {
        product.name = "Producto1";
    }

    @Override
    void buildType() {
        product.type = "Type1";
    }

    @Override
    void buildId() {
        product.id = 1234567;
    }

}
