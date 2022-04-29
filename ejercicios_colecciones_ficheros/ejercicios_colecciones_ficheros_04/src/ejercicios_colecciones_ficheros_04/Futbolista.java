/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_ficheros_04;

/**
 *
 * @author adria
 */
public class Futbolista {
    private String nombre;
    private String apellidos;
    private int dorsal;

    public Futbolista(String nombre, String apellidos, int dorsal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Dorsal: " + dorsal;
    }
    
    
    
}
