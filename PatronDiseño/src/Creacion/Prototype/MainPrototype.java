package Creacion.Prototype;

public class MainPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client.loadCache();

        Prototype t1 = (Prototype) Client.getPrototype("Type1");
        System.out.println(t1);

        Prototype t2 = (Prototype) Client.getPrototype("Type2");
        System.out.println(t2);

       

    }
}
