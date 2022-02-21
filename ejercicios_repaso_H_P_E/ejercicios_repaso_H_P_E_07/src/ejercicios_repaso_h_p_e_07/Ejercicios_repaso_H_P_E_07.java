/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso_h_p_e_07;

/**
 *
 *
 *
 * @since 21.02.2022
 * Fecha de modificación: 21.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_repaso_H_P_E_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro("Libro001", "Antes de volar", 2020);
        Libro l2 = new Libro("Libro001", "Antes de volar", 2021);
        Revista r1 = new Revista("R001", "Marca", 2020, "1001");
        Revista r2 = new Revista("R001", "Marca", 2020, "1001");
        
        System.out.println("Mostramos los libros:");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println("------------------------------------");
        System.out.println("Prestamos el libro:");
        l1.prestar();
        System.out.println("------------------------------------");
        System.out.println("Comprobamos su estado:");
        System.out.println(l1.prestado());
        System.out.println("------------------------------------");
        System.out.println("Devolvemos el libro:");
        l1.devolver();
        System.out.println("------------------------------------");
        System.out.println("Volvemos a comprobar su estado:");
        System.out.println(l1.prestado());
        System.out.println("------------------------------------");
        System.out.println("Comparamos el Libro 1 con el Libro 2:");
        System.out.println(l1.equals(l2));
        System.out.println("------------------------------------");
        l2.prestar();
        System.out.println("Mostramos los libros:");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        
        
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Mostramos las revistas:");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println("------------------------------------");
        System.out.println(r1.equals(r2));
        
    }

}
