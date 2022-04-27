package Estructural.Decorator;

public class MainDecorator {

    public static void main(String[] args) {

        Infanteria infanteria = new Infanteria(5, 4, 2, 2);
        Caballeria caballeria = new Caballeria(10, 7, 3, 1);
        Escudo escudo = new Escudo(infanteria, 0, 3);
        Espada espada = new Espada(escudo, 2, 0);

        System.out.println(escudo);
        System.out.println(espada);
        espada.removeDecorator(escudo);
      //  escudo.removeDecorator(espada);
        System.out.println(espada);
        System.out.println(escudo);

    }
}
