/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author adria
 */
public class Lista {
    int numNodos;
    Nodo nodo;
    
    public Lista() {
        this.numNodos = 0;
        this.nodo = null;
    }

    public int getNumNodos() {
        return numNodos;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    public void insertarFinal(int dato) {
        Nodo n = new Nodo(dato);
        
    }
}
