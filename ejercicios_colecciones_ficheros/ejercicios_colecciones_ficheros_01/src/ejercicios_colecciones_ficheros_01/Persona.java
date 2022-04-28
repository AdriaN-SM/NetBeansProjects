/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_ficheros_01;

/**
 *
 * @author adria
 */
public class Persona implements Comparable<Persona> {
    
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Apellidos: " + apellido + ", Nombre: " + nombre;
    }
    
    @Override
    public int compareTo(Persona p) {
        String a=new String(this.getApellido() + this.getNombre());
        String b=new String(p.getApellido() + p.getNombre());
        return a.compareTo(b);
    }
    
}
