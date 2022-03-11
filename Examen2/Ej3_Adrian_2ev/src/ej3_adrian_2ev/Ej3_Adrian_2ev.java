/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej3_adrian_2ev;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *
 *
 * @since 11.03.2022
 * Fecha de modificación: 11.03.2022
 * @author Adrian Solanas
 */
public class Ej3_Adrian_2ev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 0; //INDICA LA POSICION QUE SE QUIERE CONSULTAR
        
        Scanner teclado = new Scanner(System.in);
        
        int TAMAGNO_ARRAY = (int)(Math.random() * 100 + 1); //TAMAÑO DEL ARRAY.
        
        //VARIABLES PARA SUMAR Y DIVIDIR LAS VARIABLES.
        int dividir = 0;
        int sumaEdad = 0;
        int dividendo;
        
        //Se crea el array.
        int[] arrEdad = new int[TAMAGNO_ARRAY];
        
        //Se rellena el array de forma aleatoria.
        for(int i = 0; i<arrEdad.length; i++){
            arrEdad[i] = (int)(Math.random() * 10 + 1);
        }
        
        
        //En este bucle se suman las edades del array.
        for(int i = 0; i < arrEdad.length; i++){
            sumaEdad = sumaEdad + arrEdad[i];
        }
        
        do{
            try {
                System.out.println("Que posición quires consultar:");
                valor = teclado.nextInt();
                System.out.println("La posicion " + valor + " es " + arrEdad[valor]);
                System.out.println("Dime un valor para dividir la suma de edades:");
                
                //Se pide el número por el cual se divide la suma del array.
                dividendo = teclado.nextInt();
                dividir = sumaEdad / dividendo;
                System.out.println("La suma de las edades: " + sumaEdad + " divido: " + dividendo + " = " + dividir);
            }
            //con esta excepcion controlamos que se introduzca el tipo de dato correcto
            catch (InputMismatchException ime) {
                System.err.println("El valor introducido no es válido.");
                System.exit(0);
            }
            //esta excepción se encarga de controlar los errores de cálculos aritméticos, como por ejemplo dividir por 0
            catch (ArithmeticException ae) {
                System.err.println("No se puede dividir entre 0.");
            }
            //con esta excepcion nos aseguramos de que se elige una posición existente del array
            catch (ArrayIndexOutOfBoundsException aioobe) {
                System.err.println("La posición " + valor + " no existe.");
            }
                
            
        }while(valor >= 0);
        System.out.println("Saliendo del programa");
    }

}
