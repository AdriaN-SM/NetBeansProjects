/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_examen3ev_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 *
 *
 * @since 12.05.2022
 * Fecha de modificación: 12.05.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_examen3ev_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pelicula p1 = new Pelicula("Spider-Man", "Sam Raimi");
        Pelicula p2 = new Pelicula("Harry Potter", "Alberto");
        Pelicula p3 = new Pelicula("Regreso al futuro", "Manolo");
        Pelicula p4 = new Pelicula("Interestelar", "Alfredo");
        Pelicula p5 = new Pelicula("Indiana Jones", "Sam");
        
        List<Pelicula> listaPeliculas = new ArrayList<>();
        
        listaPeliculas.add(p1);
        listaPeliculas.add(p2);
        listaPeliculas.add(p3);
        listaPeliculas.add(p4);
        listaPeliculas.add(p5);
        
        System.out.println("Lista inicial:");
        for (int i = 0; i<listaPeliculas.size(); i++) {
            System.out.println(listaPeliculas.get(i));
        }
        
        Comparator<Pelicula> tituloComparador = new ComparadorTitulo();
        Comparator<Pelicula> directorComparador = Comparator.comparing(Pelicula::getDirector);
        Collections.sort(listaPeliculas, tituloComparador);
        System.out.println("");
        System.out.println("Lista ordenada por Titulo:");
        for (int i = 0; i<listaPeliculas.size(); i++) {
            System.out.println(listaPeliculas.get(i));
        }
        System.out.println("");
        System.out.println("Lista ordenada por Director:");
        Collections.sort(listaPeliculas, directorComparador);
        for (int i = 0; i<listaPeliculas.size(); i++) {
            System.out.println(listaPeliculas.get(i));
        }
        
    }

}
