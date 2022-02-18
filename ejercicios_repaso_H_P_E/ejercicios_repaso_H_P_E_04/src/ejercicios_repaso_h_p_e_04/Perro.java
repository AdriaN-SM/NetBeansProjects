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
public class Perro extends Mascotas {
    //Atributos
    String raza;
    Boolean pulgas;
    
    
    //Constructor
    public Perro(String raza, Boolean pulgas, String nombre, int edad, 
                 String estado, String fechaNac) {
        super(nombre, edad, estado, fechaNac);
        this.raza = raza;
        this.pulgas = pulgas;
        
    }
    //Métodos heredados
    
    @Override
    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public void habla() {
        System.out.println("GUAU GUAU.");
    }
    //Métodos no heredados
    public void tienePulgas() {
        if (pulgas == true) {
            System.out.println("El perro tiene pulgas :(");
        }
        else {
            System.out.println("El perro no tiene pulgas :)");
        }
    }
    
    //Sobreescribit toString
    @Override
    public String toString() {
        return "Perro: " + super.toString() + " raza: " + raza + " pulgas: " + pulgas;
    }
    
    
    
}
