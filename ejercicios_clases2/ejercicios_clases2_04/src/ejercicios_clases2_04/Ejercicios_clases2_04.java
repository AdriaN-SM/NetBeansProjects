/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_clases2_04;

/**
 *
 *
 *
 * @since 01.02.2022
 * Fecha de modificación: 01.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_clases2_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha f1 = new Fecha(2,2,15000);
        //System.out.println("dia tiene el mes: " + f1.diasMes());
        System.out.println("Dia Correcto: " + f1.esCorrecta());
        
        System.out.println(f1.getCadenaFecha2());
        
    }

}
