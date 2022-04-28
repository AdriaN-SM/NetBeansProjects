
package Comportamiento.Command;

public class Client {

    public static void main(String[] args) {
        
        Receiver receiver = new Receiver();
        ConcreteCommand cc = new ConcreteCommand(receiver);
        
        Invoker invoker = new Invoker();
        
        invoker.addCommand(cc);
        invoker.addCommand(cc);
        invoker.addCommand(cc);
        invoker.addCommand(cc);
        
        invoker.execute();
        
    }

}
