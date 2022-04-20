package Estructural.Facade;

import java.io.Console;

public class Facade {

    private Class1 c1  = new Class1();
    private Class2 c2  = new Class2();
    private Class3 c3  = new Class3();

    public void Operation1() {
        System.out.println("Operation 1\n"
                + c1.OperationA1() + "\n"
                + c2.OperationA2() + "\n"
                + c3.OperationA3());
    }

    public void Operation2() {
        System.out.println("Operation 2\n"
                + c1.OperationB1() + "\n"
                + c2.OperationB2() + "\n"
                + c3.OperationB3());
    }
}
