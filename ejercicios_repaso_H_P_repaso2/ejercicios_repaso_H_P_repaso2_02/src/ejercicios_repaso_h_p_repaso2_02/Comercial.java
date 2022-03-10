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
public class Comercial extends Empleado {

    double comision;

    //Constructor por defecto
    public Comercial() {
        super();
        this.comision = 0.0;
    }

    //Constructor con todos los atribtos
    public Comercial(double salario, String nombre, String apellido, int edad, double comision) {
        super(salario, nombre, apellido, edad);
        this.comision = comision;
    }

    //Getter y Setter
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    //Método heredado
    @Override
    public boolean plus(double sueldoPlus) {
        if (this.getComision() > sueldoPlus) {
            return true;
        }
        return false;
    }

    //Sobrecarga del toString()
    @Override
    public String toString() {
        return super.toString() + " Comision: " + comision;
    }
    
    
    
}
