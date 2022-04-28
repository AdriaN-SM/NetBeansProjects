
package Estructural.Composite;


/**
 * 
 * Leaf
 */

public class Trabajador extends Empleado{

    public Trabajador(String departamento, Float sueldo) {
        super(departamento, sueldo);
    }
    
    @Override
    public String getrDepartamento(){
        return toString();
    }
  
    @Override
    public String toString() {
        return "\tTrabajador {departamento de " + departamento + " con sueldo " + sueldo + '}';
    }

   
    
    
}
