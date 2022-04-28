package Estructural.Decorator;

/*
   Ddecorator

   https://es.wikipedia.org/wiki/Decorator_(patr%C3%B3n_de_dise%C3%B1o)
   https://www3.uji.es/~belfern/Docencia/Presentaciones/ProgramacionAvanzada/Tema2/decorador.html#17
   https://javapapers.com/design-patterns/decorator-pattern/
   https://www.geeksforgeeks.org/decorator-pattern-set-3-coding-the-design/
*/

import java.util.Objects;

public abstract class Equipamiento extends Tropa {

    protected Tropa tropa;

    public Equipamiento(Tropa tropa, Integer ataque, Integer defensa) {
        super(tropa.vida, tropa.movimiento, ataque, defensa);
        this.tropa = tropa;
    }
    
    public Integer getAtaque(){
       return tropa.getAtaque() + super.getAtaque();
    }

    public Integer getDefensa(){
       return tropa.getDefensa()+ super.getDefensa();
    }

    public void removeDecorator(Equipamiento toRemove) {
        if (tropa == null) {
            return;
        } else if (tropa.equals(toRemove)) {
            tropa = toRemove.tropa;
        } else {
            Equipamiento t = (Equipamiento) tropa;
            t.removeDecorator(toRemove);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipamiento other = (Equipamiento) obj;
        if (!Objects.equals(this.tropa, other.tropa)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "{vida=" + this.tropa.vida + ", movimiento=" + this.tropa.movimiento + ", ataque=" + getAtaque() + ", defensa=" + getDefensa() + '}';
    }
    
}
