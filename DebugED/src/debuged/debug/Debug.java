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
    
    public static void ejecutarBucle(Integer iteracion) {
        for (int i = 0; i < iteracion; i++) {
            System.out.println("Este es el valor actual del indice " + i);
        }
    }

    public static void ejecutarBucleAnidado(Integer iteracionExterior, Integer iteracionInterior) {
        for (int j = 0; j < iteracionExterior; j++) {
            for (int i = 0; i < iteracionInterior; i++) {
                System.out.println("Este es el valor actual del indice interior "
                        + i + " y el valor del indice exterior " + j);
            }
        }
    }
}
