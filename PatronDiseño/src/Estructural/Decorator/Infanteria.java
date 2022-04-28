
package Estructural.Decorator;

/**
 * Concrete component
 */

public class Infanteria extends Tropa {

    public Infanteria(Integer vida, Integer movimiento, Integer ataque, Integer defensa) {
        super(vida, movimiento, ataque, defensa);
    }

    @Override
    public String toString() {
       return "Infanteria{" + "vida=" + vida + ", movimiento=" + movimiento + ", ataque=" + ataque + ", defensa=" + defensa + '}';
    }
 
}
