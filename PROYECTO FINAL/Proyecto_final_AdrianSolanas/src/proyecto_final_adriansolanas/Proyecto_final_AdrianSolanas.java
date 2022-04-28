/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_final_adriansolanas;

import java.nio.charset.Charset;
import java.util.Random;
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
        
        System.out.println(cadenaAleatoria());
    }
    
    public static String cadenaAleatoria() {
        // El banco de caracteres
        String banco = "1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < 13; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
    public static String obtenerNumeroTreceDigitos() {
        byte[] bytearray;
        String mystring;
        StringBuffer thebuffer;
        int i = 13;

        bytearray = new byte[256]; 
        new Random().nextBytes(bytearray); 

        mystring = new String(bytearray, Charset.forName("UTF-8")); 

        // Create the StringBuffer
        thebuffer = new StringBuffer(); 

        for (int m = 0; m < mystring.length(); m++) { 

            char n = mystring.charAt(m); 

            if ((n >= '0' && n <= '9')&& (i > 0)) { 

                thebuffer.append(n); 
                i--; 
            } 
        } 

        // resulting string 
        return thebuffer.toString(); 
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
