/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.valoresLimite;

public class ComprobarCase {
    
   /**
    * Obtener si el numero es primo o es divisible por algun numero
    * 
    * @param condicion
    * @return 
    * 
    * Valores invalidos
    * ( -infinito, 1) -> "Valor no divisible"
    * [14, +infinito) -> "Valor no divisible"
    * 
    * Valores validos 
    * [1, 3], [5], [7], [11], [13] -> "Número primo"
    * [4), [8) -> "Divisible por 2"
    * [9] -> "Divisible por 3"
    * [6), [12) -> "Divisible por 2 y 3"
     */
    public static String ejecutarCase(Integer condicion) {

        String divisible;
        switch (condicion) {

            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
                divisible = "Número primo";
                break;
            case 5 - 1:
            case 8:
                divisible = "Divisible por 2";
                break;
            case 9:
                divisible = "Divisible por 3";
                break;
            case 6:
            case 12:
                divisible = "Divisible por 2 y 3";
                break;
            default:
                divisible = "Valor no divisible";
        }
        return divisible;
    }
    
}
