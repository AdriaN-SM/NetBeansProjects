/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_colecciones_ficheros_01;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 *
 * @since 27.04.2022
 * Fecha de modificación: 27.04.2022
 * @author Adrian Solanas
 */
public class Ejercicios_colecciones_ficheros_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Juan", "Lopez Torres");
        Persona p2 = new Persona("Ana", "Lopez Torres");
        Persona p3 = new Persona("Paula", "Zambrano Sanchez");
        Persona p4 = new Persona("Ramon", "Aguilar Ramos");
        Persona p5 = new Persona("Maria", "Lopez Torres");
        
        List<Persona> arrLisPer = new ArrayList<>();
        List<Persona> linkLisPer = new LinkedList<>();
        
        //Lleno el ArrayList
        
        arrLisPer.add(p1);
        arrLisPer.add(p2);
        arrLisPer.add(p3);
        arrLisPer.add(p4);
        arrLisPer.add(p5);
        
        //Lleno el LinkedList
        
        linkLisPer.add(p1);
        linkLisPer.add(p2);
        linkLisPer.add(p3);
        linkLisPer.add(p4);
        linkLisPer.add(p5);
        
        //Muestro sin ordenar
        System.out.println("Personas sin ordenar:");
        mostrar(arrLisPer);
        System.out.println("-------------------------------------------------");
        mostrar(linkLisPer);
        System.out.println("*************************************************");
        
        //Ordeno las listas
        sort(arrLisPer);
        sort(linkLisPer);
        
        //Muestro las listas ordenadas
        System.out.println("Personas ordenadas:");
        mostrar(arrLisPer);
        System.out.println("-------------------------------------------------");
        mostrar(linkLisPer);
        
        System.out.println("\nPrograma finalizado...");
    }
    
    public static void mostrar(List<Persona> aL) {
        System.out.println("");
        System.out.println("Imprimiendo la lista de tamaño " + aL.size());
        System.out.println("");
        for(Iterator<Persona> it = aL.iterator(); it.hasNext();) {
            Persona siguiente = it.next();
            System.out.println("Apellido: " + siguiente.getApellido() + 
                    ", Nombre: " + siguiente.getNombre());
        }
    }

}
