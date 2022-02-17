/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.debug;

/**
 *
 * @author jlopez
 */
public class Debug {
    
    /**
     * Ejecutar bucle
     * 
     * @param iteracion 
     */
    public static void ejecutarBucle(Integer iteracion) {
        for (int i = 0; i < iteracion; i++) {
            System.out.println("Este es el valor actual del indice " + i);
        }
    }

    /**
     * Ejecutar bucle anidado
     * 
     * @param iteracionExterior
     * @param iteracionInterior 
     */
    public static void ejecutarBucleAnidado(Integer iteracionExterior, Integer iteracionInterior) {
        for (int j = 0; j < iteracionExterior; j++) {
            for (int i = 0; i < iteracionInterior; i++) {
                System.out.println("Este es el valor actual del indice interior "
                        + i + " y el valor del indice exterior " + j);
            }
        }
    }
    
    /**
     * Calcular el factorial
     *
     * @param iteracion - valor del factoriala calcular
     * @return
     */
    public Integer ejecutarFactorial(Integer iteracion) {
        Integer factorial = 1;
        for (int i = 1; i <= iteracion; i++) {
            // System.out.println("Este es el valor actual del indice " + i);
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calcula una multiplicacion de 2 números sumando de 1 en 1
     *
     * @param iteracionExterior 1º operando
     * @param iteracionInterior 2º operando
     * @return multiplicacon
     */
    public Integer ejecutarMultiplicacion(Integer iteracionExterior, Integer iteracionInterior) {
        Integer sumatorio = 0;
        for (int j = 0; j < iteracionExterior; j++) {
            for (int i = 0; i < iteracionInterior; i++) {
//                System.out.println("Este es el valor actual del indice interior "
//                        + i + " y el valor del indice exterior " + j);
                sumatorio += 1;
            }
        }
        return sumatorio;
    }
}
