package Estructural.Bridge;

public class Client {

    public static void main(String[] args) {

        Abstraction ra1 = new RefinedAbstractiion("Refined Abstraction A");
        Implementor ci1 = new ConcreteImplementor1();
        Implementor ci2 = new ConcreteImplementor2();
        ra1.add(ci1);
        ra1.add(ci2);
        ra1.doSomething();
        Abstraction ra2 = new RefinedAbstractiion("Refined Abstraction B");
        ra2.add(ci1);
        ra2.doSomething();
  
    }
}
