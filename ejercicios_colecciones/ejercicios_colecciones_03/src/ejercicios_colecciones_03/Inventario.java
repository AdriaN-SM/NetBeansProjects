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
    
    private ArrayList<Mascotas> mascotas = new ArrayList<>();
    
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
    
    protected void vaciarInventario() {
        mascotas.clear();
        System.out.println("Inventario vacío.");
    }
    
    protected void mostrarListaAnimales() {
        int i=0;
        while(i<mascotas.size()){
            System.out.println(i + " -> " + getTipoMascota(mascotas.get(i)) + ": " + mascotas.get(i).getNombre());
            i++;
        }
    }
    
    protected void mostrarListaAnimales2() {
        int i=0;
        Iterator<Mascotas> it = mascotas.iterator();
        while (it.hasNext()) {
            Mascotas mascota = it.next();
            System.out.println(i + " -> " + getTipoMascota(mascota) + ": " + mascota.getNombre());
            i++;
        }
    }
    
    protected void mostrarUnAnimal(int indice) {
        System.out.println(mascotas.get(indice));
    }
    
    protected void mostrarTodosAnimales() {
        int i=0;
        Iterator<Mascotas> it = mascotas.iterator();
        while (it.hasNext()) {
            System.out.println(i + " -> " + it.next());
            i++;
        }
    }
    
    protected void mostrarTodosAnimales2() {
        int i=0;
        while(i<mascotas.size()){
            System.out.println(i + " -> " + mascotas.get(i));
            i++;
        }
    }
    
    protected void insertarAnimal(Mascotas m) {
        mascotas.add(m);
        System.out.println("Animal insertado.");
    }
    
    protected boolean eliminarAnimal(int indice) {
        if (indice >= 0 && indice < mascotas.size()) {
            mascotas.remove(indice);
            return true;
        }
        return false;
    }
}
