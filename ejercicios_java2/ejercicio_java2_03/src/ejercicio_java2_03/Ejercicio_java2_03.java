/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java2_03;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ejercicio_java2_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia;
        int mes;
        int ano;
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el número del día: ");
        dia = in.nextInt();
        if (dia >= 1 && dia <= 30) {
            System.out.print("Introduce el número del mes: ");
            mes = in.nextInt();
            if (mes >= 1 && mes <= 12) {
                System.out.print("Introduce el número del año: ");
                ano = in.nextInt();
                if (ano > 0) {
                    System.out.println("La fecha " + dia + "-" + mes + "-" + ano + " es correcta");
                }
                else {
                    System.out.println("ERROR. El año debe ser mayor a 0.");
                }
            }
            else {
                System.out.println("ERROR. Los meses son del 1 al 12.");
            }
        }
        else {
            System.out.println("ERROR. Los días son del 1 al 30.");
        }
        
        
        
    }
    
}
