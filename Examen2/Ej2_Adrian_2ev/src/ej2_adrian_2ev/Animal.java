/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_adrian_2ev;

/**
 *
 * @author adria
 */
public class Animal {
    protected String nombre; 
    protected int nivelAlimentacion; 
    protected int edad; 
    private int edadMaxima; 
    Animal(String nombre, int edadMaxima) 
    { 
        this.nombre = nombre; 
        this.nivelAlimentacion = 0; 
        this.edad = 0; 
        this.edadMaxima = edadMaxima; 
    } 


    //Getter and Setter
    public int getEdad() 
    { return edad; } 

    public String getNombre() {
        return nombre;
    }


    //Método come, se incrementa el valor de nivel de alimentación.
    //al introducir alimento.
    public void come(int alimento) 
    { 
        nivelAlimentacion = nivelAlimentacion + alimento; 
    } 

    //Indica si un Animal es Feliz, para ello 
    //su nivelAlimentacion >= 2
    public boolean esFeliz() 
    { 
        if (nivelAlimentacion >= 2){
            return true;
        }else{
            return false;
        } 
    } 

    //Comprueba si el animal esta vivo.
    //estará vivo si la edad es menor que la edadMaxima
    //que puede vivir.

    public boolean estaVivo() 
    { 
        if (nivelAlimentacion >= 0 && edad < edadMaxima){
            return true;
        }else{
            return false;
        } 
    } 

    //Métod que incrementa la edad en un año al animal.
    public void envejece() 
    { 
        edad++;
    } 
}
