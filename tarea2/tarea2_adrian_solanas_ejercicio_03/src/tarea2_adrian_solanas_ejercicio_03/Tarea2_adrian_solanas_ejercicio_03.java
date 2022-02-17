/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_adrian_solanas_ejercicio_03;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Tarea2_adrian_solanas_ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numFact = 1, cod; // numero de factura y datos a introducir por el usuario
        double precio, cantidad, litros1 = 0, litros2 = 0, litros3 = 0, litros4 = 0, litros5 = 0; // variables para almacenar los litros de cada articulo
        double total, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0; // variables para almacenar el total de cada factura
        int i = 0; // variable para el numero de facturas superiores a 600€
        
        Scanner in = new Scanner(System.in);
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║ BIENVENIDO al programa de facturas de Desinfectantes S.L. ║");
        System.out.println("║                                                           ║");
        System.out.println("║ Debes introducir un total de 5 facturas, al final se      ║");
        System.out.println("║ mostrarán los litros totales de cada artículo, la         ║");
        System.out.println("║ facturación total y el número de facturas mayores a 600€. ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        while (numFact < 6) { // mientras el numero de factura sea menor que 6
            System.out.print("\n Factura nº " + numFact); // número de la factura
            do { // introducimos el código del producto
                System.out.print("\n  Código de producto (1 - 5): ");
                cod = in.nextInt();
            } while (cod <= 0 || cod > 5); // mientras el código sea menor o igual a 0 o mayor que 5
            System.out.print("\n  Cantidad de producto (en Litros): ");
            cantidad = in.nextDouble();
            System.out.print("\n  Precio del producto en €/L: ");
            precio = in.nextDouble();
            System.out.println("\n╠═══════════════════════════════════════════════════════════╣");
            switch (cod) { // dependiendo del código de artículo introducido
                case 1: // artículo 1
                    litros1 = litros1 + cantidad; // se acumulan los litros de cada factura
                    break;
                case 2: // igual que en el caso anterior para cada artículo
                    litros2 = litros2 + cantidad;
                    break;
                case 3:
                    litros3 = litros3 + cantidad;
                    break;
                case 4:
                    litros4 = litros4 + cantidad;
                    break;
                case 5:
                    litros5 = litros5 + cantidad;
                    break;
            }
            switch (numFact) { // dependiendo del número de la factura que sea
                case 1: 
                    total1 = cantidad * precio; // guardamos el total de la factura
                    break;
                case 2:
                    total2 = cantidad * precio;
                    break;
                case 3:
                    total3 = cantidad * precio;
                    break;
                case 4:
                    total4 = cantidad * precio;
                    break;
                case 5:
                    total5 = cantidad * precio;
                    break;
            }
            numFact++; // incrementamos en 1 el número de la factura
        }
        total = total1+total2+total3+total4+total5; // sumamos todas las facturas
        if (total1 > 600) { // si hay alguna factura superior a 600€, sumamos 1 a la i
            i++;
        }
        if (total2 > 600) {
            i++;
        }
        if (total3 > 600) {
            i++;
        }
        if (total4 > 600) {
            i++;
        }
        if (total5 > 600) {
            i++;
        }
        System.out.println("║                                                           ║");
        System.out.println("║                CALCULOS DE LAS FACTURAS                   ║");
        System.out.println("║                                                           ║");
        System.out.println("  Litros totales vendidos:");
        System.out.println("  - Articulo 1: " + litros1);
        System.out.println("  - Articulo 2: " + litros2);
        System.out.println("  - Articulo 3: " + litros3);
        System.out.println("  - Articulo 4: " + litros4);
        System.out.println("  - Articulo 5: " + litros5);
        System.out.println("");
        System.out.println("  Facturas superiores a 600€: " + i);
        System.out.println("");
        System.out.println("  FACTURACIÓN TOTAL: " + total + " €");
        System.out.println("");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
    }
    
}
