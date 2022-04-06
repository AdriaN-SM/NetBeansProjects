/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adria
 */
public class Inventario {
    //Array para almacenar las mascotas
    private ArrayList<Mascotas> mascotas = new ArrayList<>();
    //método para saber el tipo de mascota
    private String getTipoMascota(Mascotas m) {
        if (m instanceof Perro)
            return "Perro";
        if (m instanceof Gato)
            return "Gato";
        if (m instanceof Loro)
            return "Loro";
        if (m instanceof Canario)
            return "Canario";
        return null;
    }
    //método para vaciar la lista
    protected void vaciarInventario() {
        mascotas.clear();
        System.out.println("Inventario vacío.");
    }
    //muestra el tipo de mascota y el nombre
    protected void mostrarListaAnimales() {
        int i=0;
        while(i<mascotas.size()){
            System.out.println(i + " -> " + getTipoMascota(mascotas.get(i)) + ": " + mascotas.get(i).getNombre());
            i++;
        }
    }
    //igual que el método anterior pero usando el Iterator
    protected void mostrarListaAnimales2() {
        int i=0;
        Iterator<Mascotas> it = mascotas.iterator();
        while (it.hasNext()) {
            Mascotas mascota = it.next();
            System.out.println(i + " -> " + getTipoMascota(mascota) + ": " + mascota.getNombre());
            i++;
        }
    }
    //método para mostrar los datos de un animal en concreto
    protected void mostrarUnAnimal(int indice) {
        if (comprobarIndice(indice))
            System.out.println(mascotas.get(indice));
        System.out.println("El número indicado no está en la lista.");
    }
    //método para mostrar todos los animales de la lista mediante un Iterator
    protected void mostrarTodosAnimales() {
        int i=0;
        Iterator<Mascotas> it = mascotas.iterator();
        while (it.hasNext()) {
            System.out.println(i + " -> " + it.next());
            i++;
        }
    }
    //igual que el método anterior pero sin usar el Iterator
    protected void mostrarTodosAnimales2() {
        int i=0;
        while(i<mascotas.size()){
            System.out.println(i + " -> " + mascotas.get(i));
            i++;
        }
    }
    //método para insertar un animal a la lista
    protected void insertarAnimal(Mascotas m) {
        mascotas.add(m);
        System.out.println("Animal insertado.");
    }
    //método para eliminar un animal de la lista
    protected boolean eliminarAnimal(int indice) {
        if (comprobarIndice(indice)) {
            mascotas.remove(indice);
            return true;
        }
        System.out.println("El número indicado no está en la lista.");
        return false;
    }
    //método para comprobar si el número de la lista introducido es correcto
    private boolean comprobarIndice(int indice) {
        if (indice > 0 && indice < mascotas.size())
            return true;
        return false;
    }
}
