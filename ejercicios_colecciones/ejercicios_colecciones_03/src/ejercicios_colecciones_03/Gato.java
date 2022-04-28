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
public class Gato extends Mascotas {

    String color;
    Boolean peloLargo;

    
    //Constructor
    public Gato(String nombre, int edad, String estado, String fechaNac, 
                String color, Boolean peloLargo) {
        super(nombre, edad, estado, fechaNac);
        this.color = color;
        this.peloLargo = peloLargo;
    }
    
    @Override
    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public void habla() {
        System.out.println("MIAU");
    }
    
    public String tienePeloLargo() {
        if (peloLargo) {
            return "tiene pelo largo.";
        }
        else {
            return "no tiene pelo largo.";
        }
    }

    @Override
    public String toString() {
        return "Gato: " + super.toString() + " color: " + color + " pelo largo: " + tienePeloLargo();
    }
        
}
