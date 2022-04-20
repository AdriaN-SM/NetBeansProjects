
package Creacion.Builder;

/**
 * Instancia a un objeto con una serie de parametros
 * 
 * https://es.wikipedia.org/wiki/Builder_(patr%C3%B3n_de_dise%C3%B1o)
 * https://migranitodejava.blogspot.com/search/label/Builder
 */


public abstract class Builder {

    protected Product product;

    abstract void buildName();

    abstract void buildType();

    abstract void buildId();

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Builder{" + "product=" + product + '}';
    }
}
