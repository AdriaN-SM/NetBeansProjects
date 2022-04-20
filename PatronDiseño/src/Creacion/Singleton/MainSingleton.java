package Creacion.Singleton;


public class MainSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton s1 = Singleton.instanciar();
        s1.setContador(2);
        s1.setContador(4);
        s1.setContador(5);
        Singleton s2 = Singleton.instanciar();
        s2.setContador(22);
        Singleton s3 = Singleton.instanciar();
        s3.setContador(15);
        Singleton s4 = Singleton.instanciar();
        System.out.println("El valor de contador es " + s4.getContador());
    }
    
}
