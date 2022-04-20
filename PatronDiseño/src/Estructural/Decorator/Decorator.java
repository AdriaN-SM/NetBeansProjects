package Estructural.Decorator;

// https://es.wikipedia.org/wiki/Decorator_(patr%C3%B3n_de_dise%C3%B1o)

import java.util.Objects;

public abstract class Decorator extends Component {

    private Component componente;

    public Decorator(Component componente) {
        this.componente = componente;
    }

    public void operation() {
        componente.operation();
    }

    public void removeDecorator(Decorator toRemove) {
        if (componente == null) {
            return;
        } else if (componente.equals(toRemove)) {
            componente = toRemove.componente;
        } else {
            removeDecorator(toRemove);
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
        final Decorator other = (Decorator) obj;
        if (!Objects.equals(this.componente, other.componente)) {
            return false;
        }
        return true;
    }
    
    
}
