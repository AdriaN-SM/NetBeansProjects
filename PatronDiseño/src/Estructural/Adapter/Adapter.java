
package Estructural.Adapter;

//https://es.wikipedia.org/wiki/Adaptador_(patr%C3%B3n_de_dise%C3%B1o)

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        // we need reference to the object we 
        // are adapting 
        this.adaptee = adaptee;
    }

    @Override
    public void originalMethod() {
        System.out.println("Este es el metodo1 de adapter");
        adaptee.methodSuplantar();
    }

    @Override
    public void method2() {
        System.out.println("Este es el metodo2 de adapter");
    }

}
