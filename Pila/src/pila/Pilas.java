/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author adria
 */
public class Pilas {
    
    Nodo primerNodo;
    int tamanyo;
    String nombre;

    public Pilas(String nombre) {
        this.tamanyo = 0;
        this.nombre = nombre;
        this.primerNodo = null;
    }

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaVacia() {
        if (tamanyo == 0) {
            return true;
        }
        else {
            return false;
        }
    }
   
    public void push(Object dato) {
        if (estaVacia()) {
            primerNodo = new Nodo(dato, null);
            tamanyo++;
        }
        else {
            Nodo nuevoNodo = new Nodo(dato, primerNodo);
            primerNodo = nuevoNodo;
            tamanyo++;
        }
    }
    
    public void pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
        }
        else {
            if (tamanyo > 1) {
                primerNodo = primerNodo.getSiguienteNodo();
                tamanyo--;
            }
            else {
                primerNodo = null;
            }
            
        }
    }
    
    public void vaciarPila(boolean seguro) {
        if (seguro) {
            tamanyo = 0;
            primerNodo = null;
        }
    }
    
    public Object cima() {
        if (estaVacia()) {
            return null;
        }
        return primerNodo.getDato();
    }
    
    public void elementos() {
        System.out.println(this.getTamanyo());
    }
    
    public void mostrar(){
        Nodo actual = primerNodo;
        while (actual.getSiguienteNodo() != null){
            System.out.println(actual.getDato());
            actual = actual.getSiguienteNodo();
        }
        System.out.println(actual.getDato());
    }
}
