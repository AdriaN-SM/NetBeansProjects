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
    Nodo primero;
    
    public Lista() {
        this.numNodos = 0;
        this.primero = null;
    }
    
    public void insertarPrincipio(int dato) {
        Nodo nuevoNodo = new Nodo(dato, primero);
        primero = nuevoNodo;
        numNodos++;
    }
    
    public void insertarMedio(int elemento1, int dato) {
        Nodo actual = primero;
        while (actual.getSiguienteNodo() != null && actual.getDato() != elemento1) {
            actual = actual.getSiguienteNodo();
        }
        Nodo nuevoNodo = new Nodo(dato, actual.getSiguienteNodo());
        actual.setSiguienteNodo(nuevoNodo);
    }
    
    public void insertarFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato, null);
        if (primero == null) {
            primero = nuevoNodo;
        }
        else {
            Nodo actual = primero;
            while (actual.getSiguienteNodo() != null) {
                actual = actual.getSiguienteNodo();
            }
            actual.setSiguienteNodo(nuevoNodo);
            numNodos++;
        }
    }
    
    public void listar(){

        Nodo actual = primero;
        while (actual.getSiguienteNodo() != null){
            System.out.println(actual.getDato());
            actual = actual.getSiguienteNodo();

        }
        System.out.println(actual.getDato());
    }
    
    public void borrar(int elemento) {
        if (primero == null) {
            System.out.println("La lista está vacía.");
        }
        else {
            if (primero.getDato() == elemento) {
                primero = primero.getSiguienteNodo();
                numNodos--;
            }
            else {
                Nodo actual = primero;
                while (actual.getSiguienteNodo() != null && actual.getSiguienteNodo().getDato() != elemento) {
                    actual = actual.getSiguienteNodo();
                }
                if (actual.getSiguienteNodo() == null) {
                    System.out.println("El elemento " + elemento + " no está en la lista.");
                }
                else {
                    actual.setSiguienteNodo(actual.getSiguienteNodo().getSiguienteNodo());
                    numNodos--;
                }
            }
        }
    }
}
