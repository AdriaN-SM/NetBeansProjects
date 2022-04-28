/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_03;

/**
 *
 * @author adria
 */
public class Canario extends Ave {

    String color;
    boolean canta;

    public Canario(String nombre, int edad, String estado, String fechaNac, 
                   String pico, Boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNac, pico, vuela);
        this.color = color;
        this.canta = canta;
    }
    
    
    
    @Override
    public void habla() {
        System.out.println("PIO PIO");
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
        return "Canario: " + super.toString() + " color: " + color + " canta: " + canta;
    }
    
}
