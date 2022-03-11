/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_adrian_2ev;

/**
 *
 * @author adria
 */
public class Equipo {
    
    /**
     * Atributos
     */
    String nombre;
    float presupuesto;

    /**
     * Contructor por defecto que define el nombre del equipo en blanco
     */
    public Equipo() {
        this.nombre = "";
    }

    /**
     * Contructor compuesto que define todos los atributos del equipo
     * 
     * @param nombre Nombre del equipo
     * @param presupuesto Presupuesto del equipo
     */
    public Equipo(String nombre, float presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }
    
    /**
     * Método para saber si un futbolista es portero
     * 
     * @param f Objeto Futbolista que vamos a evaluar
     * @return Devuelve verdadero o falso dependiendo si es un portero o no
     */
    public static boolean esPortero(Futbolista f) {
        
        if (f instanceof Portero) {
            return true;
        }
        else {
            return false;
        }
        
    }

    /**
     * Sobreescritura del método toString() para imprimir los atributos de los
     * equipos
     * 
     * @return Devuelve una cadena con los atributos del equipo
     */
    @Override
    public String toString() {
        return "Equipo: " + nombre + ", presupuesto: " + presupuesto;
    }
    
    
}
