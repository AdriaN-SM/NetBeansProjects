/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoejercicio5;

import java.util.Scanner;

/**
 *
 * @author AlumnoDAM
 */
public class RepasoEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,resultado; 
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Este programa resuleve ecuaciones de primer grado"
                + " del formato ax + b = 0");
        System.out.println("Introduzca el coeficiente de la X:"); 
        a=teclado.nextInt(); 
        System.out.println("Introduzca el término independiente:"); 
        b=teclado.nextInt(); 
        if(a==0){ 
            System.out.println("No es una ecuación de primer grado"); 
        }else{ 
            if (b==0){
                System.out.println("El resultado es: 0");
            }else{
                resultado=-b/a; 
                System.out.println("El resultado es: " +resultado); 
            }
        }
    }
    
}
