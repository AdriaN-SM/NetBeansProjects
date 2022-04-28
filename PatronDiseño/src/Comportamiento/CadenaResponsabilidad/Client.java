package Comportamiento.CadenaResponsabilidad;

public class Client {

    public static void main(String[] args) {

        // Setup Chain of Responsibility
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        h1.setNext(h2);
        
        System.out.println(h1.next);

        // Send requests to the chain
        System.out.println(h1.handleRequest("Texto largo largo largo "));
        System.out.println(h1.handleRequest("Texto"));

    }
}
