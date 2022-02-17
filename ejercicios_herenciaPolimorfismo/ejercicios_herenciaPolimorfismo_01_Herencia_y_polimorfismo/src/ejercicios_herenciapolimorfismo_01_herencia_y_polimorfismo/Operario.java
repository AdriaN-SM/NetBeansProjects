/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_herenciapolimorfismo_01_herencia_y_polimorfismo;

/**
 *
 * @author adria
 */
public class Operario extends Empleado {

    public Operario() {
    }

    public Operario(String nombre) {
        super(nombre);
    }

    
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
    
}
