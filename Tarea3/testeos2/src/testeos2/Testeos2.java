/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testeos2;

import java.util.Arrays;

/**
 *
 *
 *
 * @since 10.02.2022
 * Fecha de modificación: 10.02.2022
 * @author Adrian Solanas
 */
public class Testeos2 {
    public static int[] arr1 = new int [4];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        
        System.out.println(Arrays.toString(arr1));
        agnadir();
        System.out.println(Arrays.toString(arr1));
    }
    
    public static void agnadir() {
        arr1 = Arrays.copyOf(arr1, arr1.length+1);
        arr1[4] = 5;
        //System.out.println(Arrays.toString(arr));
        //return arr;
    }

}
