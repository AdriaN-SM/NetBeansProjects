/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_e_04;

/**
 *
 * @author adria
 */
public abstract class Ave extends Mascotas {

    String pico;
    Boolean vuela;

    public Ave(String nombre, int edad, String estado, String fechaNac, 
               String pico, Boolean vuela) {
        super(nombre, edad, estado, fechaNac);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    @Override
    public abstract void habla();
    @Override
    public abstract void mostrar();
    public abstract void volar();

    @Override
    public String toString() {
        return "Aves: " + super.toString() + " pico: "
                + pico + " vuela: " + vuela;
    }
    
}
