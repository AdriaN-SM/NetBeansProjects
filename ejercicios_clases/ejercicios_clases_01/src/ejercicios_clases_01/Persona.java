/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clases_01;

/**
 *
 * @author adria
 */
public class Persona {
    
    String nombre;
    String apellidos;
    int edad;
    String dni;
    
    public Persona() {
        
    }
    
    
    public Persona(String nom, String apell, int edad, String dni) {
        this.nombre=nom;
        this.apellidos=apell;
        this.edad=edad;
        this.dni=dni;
    }
    
    public String Mostrar(Persona persona) {
        String general= "La persona ";
        general+=persona.nombre+" ";
        general+=persona.apellidos;
        general+=", con DNI "+persona.dni;
        general+=" tiene una edad de "+persona.edad+" años.";
        return general;
    }
    
    public void mayorEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
        else {
            System.out.println("NO es mayor de edad.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + '}';
    }
    
    
    
}
