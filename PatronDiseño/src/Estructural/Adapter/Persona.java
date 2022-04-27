
package Estructural.Adapter;

/**
 *
 */
public class Persona implements Humano{

    private Integer edad;
    private String nombre;
    
    @Override
    public Integer edad() {
        return edad;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
