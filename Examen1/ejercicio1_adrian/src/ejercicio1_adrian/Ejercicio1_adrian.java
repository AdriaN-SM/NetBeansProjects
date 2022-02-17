/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_adrian;

import java.util.Scanner;

/**
 *
 * @author adrian solanas
 */
public class Ejercicio1_adrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia, mes, ano;
        String sDia, sMes, sAno;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa evalua si la fecha es correcta y muestra la fecha al dia siguiente.");
        System.out.println("Introduce el día: "); // introducimos el día
        dia = in.nextInt();
        
        if (dia >= 1 && dia <= 30) { // si el dia es de 1 a 30
            System.out.println("Introduce el mes: "); // nos pide el mes
            mes = in.nextInt();
            if (mes >= 1 && mes <= 12) { // si el mes es de 1 a 12
                System.out.println("Introduce el año: "); // nos pide el año
                ano = in.nextInt();
                if (ano > 0) { // si el año es mayor que 0
                    System.out.println("Fecha CORRECTA :)");
                    dia++; // sumamos 1 al dia
                    if (dia == 31) { // si al sumar 1 al dia, son 31 dias
                        mes++; // le sumamos 1 al mes
                        dia = 1; // y ponemos el dia a 0
                        if (mes == 13) { // si al sumar 1 al mes, son 13 meses
                            ano++; // sumamos 1 al año
                            mes = 1; // y ponemos el mes a 1
                        }
                    }
                    sDia = String.valueOf(dia); // pasamos el dia, mes y año a String
                    sMes = String.valueOf(mes);
                    sAno = String.valueOf(ano);
                    if (sDia.length() == 1) { // si la longitud de la cadena del dia es 1
                        sDia = "0" + sDia; // añadimos un 0 delante del dia
                    }
                    if (sMes.length() == 1) { // si la longitud de la cadena del mes es 1
                        sMes = "0" + sMes; // añadimos un 0 delante de del mes
                    }
                    if (sAno.length() == 1) { // si la longitud de la cadena del año es 1
                        sAno = "0" + sAno; // añadimos un 0 delante del año
                    }
                    System.out.println("La fecha un dia después es: " + sDia + "-" + sMes + "-" + sAno); // mostramos el resultado
                }
                else {
                    System.out.println("ERROR. El año debe ser superior a 0");
                }
            }
            else {
                System.out.println("ERROR. Los meses van de 1 a 12.");
            }
        }
        else {
            System.out.println("ERROR. Los dias van de 1 a 30.");
        }
        
        
    }
    
}
