/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_funciones_04;

import java.util.Scanner;

/**
 *
 * Realizar una función que calcule (muestre en pantalla) el área o el volumen de un
 * cilindro, según se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para
 * área) o 'v' (para el volumen). Además hemos de pasarle a la función el radio y la altura.
 *
 *
 * @since 10.12.2021
 * Fecha de modificación: 15.12.2021
 * @author Adrian Solanas
 */
public class Ejercicios_funciones_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Boolean opcion = false;
        Double result;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa calcula el área o el volumen de un cilindro.");
        
        do {
            System.out.println("Debes elegir una opción:");
            System.out.println(" a -> Calcular área.");
            System.out.println(" v -> Calcular volumen.");
            System.out.print("Opción: ");
            String option = in.nextLine();
            if (option.length() == 1) {
                option = option.toLowerCase();
                if (option.charAt(0) == 'a' || option.charAt(0) == 'v') {
                    opcion = true;
                    result = areaVolumen(option);
                    System.out.println("El resultado es: " + result);
                    System.out.println("\nPrograma finalizado...");
                }
                else {
                    System.out.println("\nERROR. Opción incorrecta.\n");
                }
            }
            else {
                System.out.println("\nERROR. Opción incorrecta.\n");
            }
        } while (opcion == false);
        
        
    }
    
    public static double areaVolumen(String option) {
        double radio, altura, resultado;
        if (option.charAt(0) == 'v') {
            System.out.println("\nVolumen de un cilindro.\n");
            System.out.print("Introduce el radio del cilindro: ");
            radio = entradaDouble();
            System.out.print("Introduce la altura del cilindro: ");
            altura = entradaDouble();
            resultado = Math.PI * (radio*radio)*altura;
            
        }
        else {
            System.out.println("\nÁrea de un cilindro.\n");
            System.out.print("Introduce el radio del cilindro: ");
            radio = entradaDouble();
            System.out.print("Introduce la altura del cilindro: ");
            altura = entradaDouble();
            resultado = 2 * Math.PI * radio * (radio + altura);
        }
        return resultado;
    }
    
    public static double entradaDouble() {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

}
