package Estructural.Decorator.Composite;

public class Client {

    public static void main(String[] args) {

        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");
        Leaf leaf3 = new Leaf("Leaf3");
        Leaf leaf4 = new Leaf("Leaf4");

        Composite c2 = new Composite("Composite2");
        c2.add(leaf1);
        c2.add(leaf2);
        c2.add(leaf3);

        Composite c3 = new Composite("Composite2");
        c2.add(leaf4);

        Composite c1 = new Composite("Composite2");
        c1.add(c2);
        c1.add(c3);

       c1.method();
    }
}
