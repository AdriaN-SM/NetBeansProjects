/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pila;

/**
 *
 *
 *
 * @since 21.03.2022
 * Fecha de modificación: 21.03.2022
 * @author Adrian Solanas
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilas pila = new Pilas("PrimeraPila");
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        
        pila.mostrar();
        System.out.println("***************");
        System.out.println("El primer elemento es: "+ pila.cima());
        System.out.println("***************");
        System.out.print("La cantidad de elementos es: ");
        pila.elementos();
        System.out.println("***************");
        pila.mostrar();
        pila.pop();
        System.out.println("***************");
        pila.mostrar();
        
        pila.vaciarPila(true);
    }

}
