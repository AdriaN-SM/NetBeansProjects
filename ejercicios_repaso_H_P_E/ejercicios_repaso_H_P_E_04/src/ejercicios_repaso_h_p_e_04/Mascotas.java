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
    final String fechaNac;
    //Constructor vacío
    public Mascotas() {
        fechaNac = null;
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
    public int cumpleaños() {
        return edad+1;
    }
    
    public boolean estaEnInv() {
        if (estado.equals("Tienda")) {
            return true;
        }
        else {
            return false;
        }
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaNac() {
        return fechaNac;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Sobrecarga de toString
    public String toString() {
        return "Nombre: " + nombre + " edad: " + edad + " estado: " +
                estado + " fecha nacimiento: " + fechaNac;
    }
    //Sobrecarga de equals
    public boolean equals(Mascotas m) {
        if (nombre.equals(m.getNombre()) && edad == m.getEdad()) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
