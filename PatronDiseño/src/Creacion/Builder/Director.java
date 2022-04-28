
package Creacion.Builder;

public class Director {
    
    private Builder builder;

    public Product getBuilder() {
        return builder.product;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
 
    public void construirProduct() {
       builder.buildId();
       builder.buildName();
       builder.buildType();
    }
    
}
