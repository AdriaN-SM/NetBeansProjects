/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_repaso_examen_02;

import java.util.Scanner;

/**
 *
 * Leer una cadena de hasta 80 caracteres. Generar un número aleatorio, y en 
 * función de éste, pasarla a mayúsculas ó a minúsculas e imprimir la cadena 
 * resultante
 * 
 * @author adria
 */
public class Ejercicio_repaso_examen_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        int aleatorio = (int) Math.floor(Math.random()*10+1);
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa pasa a mayúsculas o minúsculas una frase dependiendo de un número aleatorio.");
        do {
            System.out.print("\nIntroduce una frase (<80 carácteres): ");
            frase = in.nextLine();
            if (frase.length() > 80) {
                System.out.println("ERROR. La frase debe tener 80 carácteres máximo.");
            }
        } while (frase.length() > 80);
        
        System.out.println("Número aleatorio (0-10): " + aleatorio);
        
        if (aleatorio < 5) {
            frase = frase.toUpperCase();
        }
        else {
            frase = frase.toLowerCase();
        }
        System.out.println("Resultado: " + frase);
        
    }
    
}
