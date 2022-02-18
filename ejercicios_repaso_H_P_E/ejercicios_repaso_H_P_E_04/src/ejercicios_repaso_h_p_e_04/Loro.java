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
public class Loro extends Ave {

    String origen;
    Boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNac, 
               String pico, Boolean vuela, String origen, Boolean habla) {
        super(nombre, edad, estado, fechaNac, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }
    
    @Override
    public void habla() {
        System.out.println("Hola Holita vecinito");
    }

    @Override
    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public void volar() {
        if (vuela == true) {
            System.out.println("Puede volar");
        }
        else {
            System.out.println("No puede volar");
        }
    }

    @Override
    public String toString() {
        return "Loro: " + super.toString() + " origen: "
                + origen + " habla: " + habla;
    }
    
    
}
