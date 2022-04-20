
package ejerciciodiagramaclases;

/**
 *
 */
public class Tablero extends Componente{

    public Tablero() {
    }

    public Tablero(String color, String material, String descripcion, Dimension dimension, String forma) {
        super(color, material, descripcion, dimension, forma);
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
        return obj instanceof Tablero;
    }
}
