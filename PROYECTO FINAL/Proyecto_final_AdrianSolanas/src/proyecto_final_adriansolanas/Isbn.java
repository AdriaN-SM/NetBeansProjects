/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_adriansolanas;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author adria
 */
public class Isbn {
    private String isbn;
    
    public static Set<String> isbnGenerados = new HashSet<>();

    protected Isbn() {
        this.isbn = isbnSinRepetir();
    }
    
    private static String generarISBN() {
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
    private static String isbnSinRepetir() {
        String aleatorio = "";
        boolean generado = false;
        while(!generado) {
            String posible = generarISBN();
            if (!isbnGenerados.contains(posible)) {
                isbnGenerados.add(posible);
                aleatorio = posible;
                generado = true;
            }
        }
        return aleatorio;
    }

    private static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    @Override
    public String toString() {
        return isbn;
    }
    
}
