
package Estructural.Adapter;

public class Client {

    public static void main(String[] args) {
        
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

      //  adaptee.methodSuplantar();
        
        adapter.originalMethod();
       // adapter.method2();
    }

}
