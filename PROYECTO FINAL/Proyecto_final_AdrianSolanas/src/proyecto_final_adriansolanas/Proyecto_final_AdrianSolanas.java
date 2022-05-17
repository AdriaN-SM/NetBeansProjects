/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_final_adriansolanas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{3}$");
        Matcher matcher = pattern.matcher("999-999-999");

        if (matcher.matches()) {
            System.out.println("BIEN");
        }
        else {
            System.out.println("MAL");
        }
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
