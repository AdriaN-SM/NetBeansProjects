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
public class Cola {
    Nodo primerNodo;
    Nodo ultimoNodo;
    String nombre;
    int tamanyo;

    public Cola(String nombre) {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.nombre = nombre;
        this.tamanyo = 0;
    }

    public int getTamanyo() {
        return tamanyo;
    }
    
    public boolean estaVacia() {
        return primerNodo == null;
    }
    
    public void añadir(Object dato) {
        Nodo nuevoNodo = new Nodo(dato, null);
        if (estaVacia()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
            tamanyo++;
        }
        else {
            ultimoNodo.setSiguienteNodo(nuevoNodo);
            ultimoNodo = nuevoNodo;
            tamanyo++;
        }
    }
    
    public void eliminar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        }
        else {
            primerNodo = primerNodo.getSiguienteNodo();
            tamanyo--;
        }
    }
    
    public void vaciarCola() {
        primerNodo = null;
        ultimoNodo = null;
        tamanyo = 0;
    }
    
    public Object obtenerFrente() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        }
        return primerNodo.getDato();
    }
    
    public Object obtenerFinal() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        }
        return ultimoNodo.getDato();
    }
    
    public int elementos() {
        return getTamanyo();
    }
    
    public void mostrar(){
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        }
        else {
            Nodo actual = primerNodo;
            while (actual.getSiguienteNodo() != null){
                System.out.println(actual.getDato());
                actual = actual.getSiguienteNodo();
            }
            System.out.println(actual.getDato());
        }
    }
}
