
package ejerciciodiagramaclases;

/**
 *
 */
public class Mesa extends Mueble {

    public Mesa() {
    }

    public Mesa(String descripcion) {
        super(descripcion);
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
        return obj instanceof Mesa;
    }
    
    
}
