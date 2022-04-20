
package Creacion.Builder;

public class ConcreteBuilder2 extends Builder{

    public ConcreteBuilder2() {
        super.product = new Product();
    }
    
    @Override
    void buildName() {
        product.name = "Producto2";
    }

    @Override
    void buildType() {
        product.type = "Type2";
    }

    @Override
    void buildId() {
        product.id = 23480921;
    }
    
}
