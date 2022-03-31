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
    
    public String getTipoMascota(Mascotas m) {
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
    
    public void vaciarInventario() {
        mascotas.clear();
        System.out.println("Inventario vacío.");
    }
    
    public void mostrarListaAnimales() {
//        Iterator it = mascotas.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        int i=0;
        while(i<mascotas.size()){
            System.out.println(getTipoMascota(mascotas.get(i)) + " " + mascotas.get(i).getNombre());
            i++;
        }
    }
    
    public void insertarAnimal(Mascotas e) {
        mascotas.add(e);
        System.out.println("Animal insertado.");
    }
    
    public boolean eliminarAnimal(int indice) {
        if (indice >= 0 && indice < mascotas.size()) {
            mascotas.remove(indice);
            return true;
        }
        return false;
    }
}
