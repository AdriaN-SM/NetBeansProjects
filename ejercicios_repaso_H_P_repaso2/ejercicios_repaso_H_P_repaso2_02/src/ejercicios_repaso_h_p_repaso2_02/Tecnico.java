/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_repaso2_02;

/**
 *
 * @author adria
 */
public class Tecnico extends Empleado {

    double productividad;

    //Constructor por defecto
    public Tecnico() {
        super();
        this.productividad = 0.0;
    }

    //Constructor con todos los atributos
    public Tecnico(double salario, String nombre, String apellido, int edad, double productividad) {
        super(salario, nombre, apellido, edad);
        this.productividad = productividad;
    }

    //Getter y Setter
    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }
    
    //Método heredado
    @Override
    public boolean plus(double sueldoPlus) {
        if (this.getProductividad() > sueldoPlus) {
            return true;
        }
        return false;
    }
    
}
