package Estructural.Decorator;

/**
 * Concrete decorator
 */
public class Espada extends Equipamiento {

    public Espada(Tropa tropa, Integer ataque, Integer defensa) {
        super(tropa, ataque, defensa);
    }

     @Override
    public String toString() {
        return "con espada{" + super.toString();
    }
}
