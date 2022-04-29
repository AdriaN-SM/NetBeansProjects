/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_final_adriansolanas;

import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 *
 *
 * @since 27.04.2022
 * Fecha de modificación: 27.04.2022
 * @author Adrian Solanas
 */
public class Proyecto_final_AdrianSolanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Isbn pos;
        int nIsbns = 10;
        Stack<Isbn> almacenIsbns = new Stack<>();
        for (int i = 0; i < nIsbns; i++) {
            pos = new Isbn();
            while(almacenIsbns.contains(pos)) {
                pos = new Isbn();
            }
            almacenIsbns.push(pos);
        }
        System.out.println(almacenIsbns.toString());
    }
    
    public static void menu() {
        System.out.println("***************************************");
        System.out.println("* 1. Baja de un libro                 *");
        System.out.println("* 2. Alta de un libro                 *");
        System.out.println("* 3. Baja de un socio                 *");
        System.out.println("* 4. Listado de prestamos de un socio *");
        System.out.println("* 5. Datos de un socio                *");
        System.out.println("* 6. Crear un préstamo                *");
        System.out.println("* 7. Devolver un libro                *");
        System.out.println("***************************************");
    }

}
