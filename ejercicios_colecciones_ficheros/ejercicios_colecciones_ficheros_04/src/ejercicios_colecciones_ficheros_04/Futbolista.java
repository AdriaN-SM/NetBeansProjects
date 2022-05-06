/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_ficheros_04;

import java.io.Serializable;

/**
 *
 * @author adria
 */
public class Futbolista implements Comparable<Futbolista>, Serializable {
    private String nombre;
    private String apellidos;
    private String dorsal;

    public Futbolista(String nombre, String apellidos, String dorsal) {
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

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Dorsal: " + dorsal;
    }

    @Override
    public int compareTo(Futbolista o) {
        Futbolista futbolista = o;
        if(this.apellidos.compareToIgnoreCase(futbolista.apellidos) == 0) {           
            if(this.nombre.compareToIgnoreCase(futbolista.nombre) == 0) {
                return this.dorsal.compareToIgnoreCase(futbolista.dorsal);
            } else {
                return this.nombre.compareToIgnoreCase(futbolista.nombre);
            }
        } else {
            return this.apellidos.compareToIgnoreCase(futbolista.apellidos);
        }
    }
}
