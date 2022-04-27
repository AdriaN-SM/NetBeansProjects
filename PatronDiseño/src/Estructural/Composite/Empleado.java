
package Estructural.Composite;


/**
 *  Component
 */

public abstract class Empleado {
    
    protected String departamento;
    protected Float sueldo;

    public Empleado(String departamento, Float sueldo) {
        this.departamento = departamento;
        this.sueldo = sueldo;
    }
    
    public String getrDepartamento(){return "Empleado departamento: " + departamento + " con sueldo " + getSueldo();
    }
    
    public Float getSueldo() { 
        return sueldo; 
    };
}
