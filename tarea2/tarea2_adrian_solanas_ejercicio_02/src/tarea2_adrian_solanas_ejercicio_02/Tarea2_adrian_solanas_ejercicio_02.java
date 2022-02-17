/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_adrian_solanas_ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Tarea2_adrian_solanas_ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int hora, minuto, segundo; // variables en las que almacenaremos la hora, minuto y segundo que introduzca el usuario
        String sHora, sMinuto, sSegundo;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Programa para comprobar la hora que introduzcas (hh:mm:ss)");
        System.out.println("Introduce la hora: ");
        hora = in.nextInt();
        
        
        
        
        if (hora >= 0 && hora <= 23) { // si la hora es de 0 a 23
            System.out.println("Introduce el minuto: "); // nos pide el minuto
            minuto = in.nextInt();
            if (minuto >= 0 && minuto <= 59) { // si el minuto es de 0 a 59
                System.out.println("Introduce los segundos: "); // nos pide los segundos
                segundo = in.nextInt();
                if (segundo >= 0 && segundo <= 59) { // si los segundos van de 0 a 59
                    System.out.println("Hora CORRECTA :)");
                    segundo++; // sumamos 1 a los segundos
                    if (segundo == 60) { // si al sumar 1 al segundo, son 60 segundos
                        minuto++; // le sumamos 1 al minuto
                        segundo = 0; // y ponemos los segundos a 0
                        if (minuto == 60) { // si al sumar 1 al minuto, son 60 minutos
                            hora++; // sumamos 1 a la hora
                            minuto = 0; // y ponemos el minuto a 0
                            if (hora == 24) { // si al sumar 1 a la hora, son 24 horas
                                hora = 0; // ponemos la hora a 0
                            }
                        }
                    }
                    sHora = String.valueOf(hora); // pasamos las horas, minutos y segundos a String
                    sMinuto = String.valueOf(minuto);
                    sSegundo = String.valueOf(segundo);
                    if (sHora.length() == 1) { // si la longitud de la hora es 1
                        sHora = "0" + sHora; // añadimos un 0 delante de la hora
                    }
                    if (sMinuto.length() == 1) { // si la longitud de los minutos es 1
                        sMinuto = "0" + sMinuto; // añadimos un 0 delante de los minutos
                    }
                    if (sSegundo.length() == 1) { // si la longitud de los segundos es 1
                        sSegundo = "0" + sSegundo; // añadimos un 0 delante de los segundos
                    }
                    System.out.println("Un segundo después, la hora es: " + sHora + ":" + sMinuto + ":" + sSegundo); // mostramos el resultado
                }
                else {
                    System.out.println("ERROR. Los segundos van de 0 a 59");
                }
            }
            else {
                System.out.println("ERROR. Los minutos van de 0 a 59.");
            }
        }
        else {
            System.out.println("ERROR. Las horas van de 0 a 23.");
        }
        
    }
    
}
