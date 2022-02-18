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
public abstract class Mascotas {
    //Atributos
    String nombre;
    int edad;
    String estado;
    String fechaNac;
    //Constructor vacío
    public Mascotas() {
    }
    //Constructor con todos los atributos
    public Mascotas(String nombre, int edad, String estado, String fechaNac) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNac = fechaNac;
    }
    //Métodos abstractos
    public abstract void mostrar();
    public abstract void habla();
    //Métodos
    public void cumpleaños() {
        
    }
    
    public void estaEnInv() {
        
    }
    
}
