/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploordenarsort;

import java.util.Arrays;

/**
 *
 * @author adria
 */
public class EjemploOrdenarSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = {12,3,5,21,4,85,6,9,2,1};
        
        
        System.out.println("Array desordenado");
        
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
            System.out.println("Posición " + i + " es " + arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("");
        System.out.println("Iniciando ordenación Sort...");
        System.out.println("");
        
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
            System.out.println("Posición " + i + " es " + arr[i] + " ");
        }
        
    }
    
}
