package Creacion.Prototype;

/**
 * 
 * Se usa cuando el tipo de las instancias se define en tiempo de ejecucion 
 * y el coste de instanciacion es muy costoso
 * Uses:
 * https://es.wikipedia.org/wiki/Prototipo_(patr%C3%B3n_de_dise%C3%B1o)
 * https://refactoring.guru/design-patterns/prototype/java/example
 * https://www.oodesign.com/prototype-pattern.html
 * https://migranitodejava.blogspot.com/search/label/Prototype
 */

public abstract class Prototype implements Cloneable {

    protected String type;

    abstract void method();

    public String getType() {
        return type;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    @Override
    public String toString() {
        return "Prototype{" + "type=" + type + '}';
    }

}
