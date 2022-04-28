
package Estructural.Decorator;

/**
 * Concrete component
 */

public class Caballeria extends Tropa {

    public Caballeria(Integer vida, Integer movimiento, Integer ataque, Integer defensa) {
        super(vida, movimiento, ataque, defensa);
    }

    @Override
    public String toString() {
       return "Caballeria{" + "vida=" + vida + ", movimiento=" + movimiento + ", ataque=" + ataque + ", defensa=" + defensa + '}';
    }
 
}
