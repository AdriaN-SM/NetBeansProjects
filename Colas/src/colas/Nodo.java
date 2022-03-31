/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author adria
 */
public class Nodo {
    Object dato;
    Nodo siguienteNodo;
    
    public Nodo(Object numero, Nodo sigNodo) {
        this.dato = numero;
        this.siguienteNodo = sigNodo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    
}
