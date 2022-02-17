/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_cadenas_03;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_cadenas_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String numero, c1="", c2="", c3="";
        int i;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número de teléfono con el formato 000000000: ");
        numero = in.nextLine();
        
        for(i=0;i<numero.length();i++){
            if(i<3){
                c1=c1+numero.charAt(i);
            }
            else{
                if(i<6){
                    c2+=numero.charAt(i);
                }
                else{
                    c3+=numero.charAt(i);
                }
            }
        }
        System.out.println("El nuevo formato es: "+c1+"-"+c2+"-"+c3);
    }
    
}
