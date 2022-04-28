/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

/**
 *
 *
 *
 * @since 23.03.2022
 * Fecha de modificación: 23.03.2022
 * @author Adrian Solanas
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cola cola = new Cola("Cola 1");
        
        //añadimos los elementos
        cola.añadir(1);
        cola.añadir(2);
        cola.añadir(3);
        cola.añadir(4);
        
        
        cola.mostrar();
        
        System.out.println("Eliminamos el primer elemento de la cola.");
        cola.eliminar();
        cola.mostrar();
        System.out.println("El primer elemento de la cola es " + cola.obtenerFrente());
        System.out.println("El último elemento de la cola es " + cola.obtenerFinal());
        System.out.println("La cola contiene " + cola.elementos() + " elemento(s)");
        
        System.out.println("Vaciamos la cola:");
        cola.vaciarCola();
        cola.mostrar();
    }

}
