package Estructural.Decorator;

/**
 *  Concrete decorator
 */
public class Escudo extends Equipamiento {

    public Escudo(Tropa tropa, Integer ataque, Integer defensa) {
        super(tropa, ataque, defensa);
    }
    
    @Override
    public String toString() {
        return "con escudo{" + super.toString();
    }
}

