/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaenlazada;

/**
 *
 *
 *
 * @since 17.03.2022
 * Fecha de modificación: 17.03.2022
 * @author Adrian Solanas
 */
public class ListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista lista = new Lista();
        Lista personas = new Lista();
        
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(4);
        lista.insertarFinal(5);
//        lista.insertarPrincipio(2);
//        lista.insertarPrincipio(1);
        personas.insertarFinal(new Persona("Alvaro", 48, 15));
        personas.insertarFinal(new Persona("Alberto", 21, 185));
        personas.insertarFinal(new Persona("Adrián", 20, 180));
        personas.insertarFinal(new Persona("Alejandro", 11, 157));
        
        lista.listar();
        System.out.println("**************");
        personas.listar();
//        
//        lista.borrar(3);
        System.out.println("**************");
        
        lista.listar();
        
        lista.insertarMedio(2, 3);
        System.out.println("**************");
        lista.listar();
    }

}
