package Comportamiento.Iterator;

public class Client {

    public static void main(String[] args) {

        ConcreteAggregate concreteAggregate = new ConcreteAggregate();

        Iterator iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }

    }

}
