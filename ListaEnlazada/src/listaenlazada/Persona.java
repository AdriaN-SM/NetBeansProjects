/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author Adrian Solanas
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private int altura;	
    private static int contador;

    Persona(){
            nombre=""; 
    }
    
    Persona(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    public static int getContador() {
            return contador;
    }

    public int getAltura() {
            return altura;
    }
    
    public void setAltura(int altura) {
            this.altura = altura;
    }
    
    public String getNombre() {
            return nombre;
    }
    
    public void setNombre(String unNombre) {
            nombre = unNombre;
    }
    
    public int getEdad() {
            return edad;
    }
    
    public void setEdad(int unaEdad) {
            edad = unaEdad;
    }
    
    public String toString(){
            return "soy " + nombre + " de " + edad + " años " + " y " + altura + " altura ";
    }
}
