/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_clases2_01;

import java.util.Scanner;

/**
 *
 *
 *
 * @since 21.01.2022
 * Fecha de modificación: 21.01.2022
 * @author Adrian Solanas
 */
public class Ejercicios_clases2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        
        Hora h1 = new Hora();
        Hora h2 = new Hora();
        Hora h3 = new Hora();
        
        System.out.println("Programa para operar con horas (formato 24h)");
        System.out.println("");
        do {
            System.out.print("Introduce la hora: ");
            h1.hora = entradaEntero();
            if (h1.comprobarHora() == false) {
                System.out.println("ERROR. Hora incorrecta.");
            }
        }while(h1.comprobarHora() == false);
        do {
            System.out.print("Introduce los minutos: ");
            h1.minutos = entradaEntero();
            if (h1.comprobarMinutos() == false) {
                System.out.println("ERROR. Minutos incorrectos.");
            }
        }while(h1.comprobarMinutos() == false);
        do {
            System.out.print("Introduce los segundos: ");
            h1.segundos = entradaEntero();
            if (h1.comprobarSegundos() == false) {
                System.out.println("ERROR. Segundos incorrectos");
            }
        }while(h1.comprobarSegundos() == false);
        
        
        do {
            menuOperaciones();
            System.out.print("Elije una opción: ");
            opcion = entradaEntero();
            if (opcion < 0 || opcion > 2) {
                System.out.println("ERROR. Opción incorrecta.");
            }
            
            switch (opcion) {
                case 1:
                    System.out.println("\nSumar horas:");
                    System.out.println("Introduce una nueva hora para sumarla a la hora introducida.");
                    System.out.println("\nLa hora introducida es: " + h1.toString());
                    do {
                        System.out.print("Introduce la hora: ");
                        h2.hora = entradaEntero();
                        if (h2.comprobarHora() == false) {
                            System.out.println("ERROR. Hora incorrecta.");
                        }
                    }while(h2.comprobarHora() == false);
                    do {
                        System.out.print("Introduce los minutos: ");
                        h2.minutos = entradaEntero();
                        if (h2.comprobarMinutos() == false) {
                            System.out.println("ERROR. Minutos incorrectos.");
                        }
                    }while(h2.comprobarMinutos() == false);
                    do {
                        System.out.print("Introduce los segundos: ");
                        h2.segundos = entradaEntero();
                        if (h2.comprobarSegundos() == false) {
                            System.out.println("ERROR. Segundos incorrectos");
                        }
                    }while(h2.comprobarSegundos() == false);
                    
                    //suma
                    
                    if (h1.segundos + h2.segundos >= 60) {
                        h3.segundos = h1.segundos + h2.segundos - 60;
                        h3.minutos += 1;
                    }
                    else {
                        h3.segundos = h1.segundos + h2.segundos;
                    }
                    
                    if (h1.minutos + h2.minutos >= 60) {
                        h3.minutos = h1.minutos + h2.minutos - 60;
                        h3.hora += 1;
                    }
                    else {
                        h3.minutos = h1.minutos + h2.minutos;
                    }
                    
                    if (h1.hora + h2.hora >= 24) {
                        h3.hora = h1.hora + h2.hora - 24;
                    }
                    else {
                        h3.hora = h1.hora + h2.hora;
                    }
                    
                    h3.comprobarHora();
                    h3.comprobarMinutos();
                    h3.comprobarSegundos();
                    
                    System.out.println(h1.toString() + " + " + h2.toString() + " = " + h3.toString());
                    break;
                case 2:
                    System.out.println("\nRestar horas");
                    System.out.println("Introduce una nueva hora para restarla a la hora introducida.");
                    System.out.println("\nLa hora introducida es: " + h1.toString());
                    do {
                        System.out.print("Introduce la hora: ");
                        h2.hora = entradaEntero();
                        if (h2.comprobarHora() == false) {
                            System.out.println("ERROR. Hora incorrecta.");
                        }
                    }while(h2.comprobarHora() == false);
                    do {
                        System.out.print("Introduce los minutos: ");
                        h2.minutos = entradaEntero();
                        if (h2.comprobarMinutos() == false) {
                            System.out.println("ERROR. Minutos incorrectos.");
                        }
                    }while(h2.comprobarMinutos() == false);
                    do {
                        System.out.print("Introduce los segundos: ");
                        h2.segundos = entradaEntero();
                        if (h2.comprobarSegundos() == false) {
                            System.out.println("ERROR. Segundos incorrectos");
                        }
                    }while(h2.comprobarSegundos() == false);
                    
                    //resta
                    
                    if (h1.segundos - h2.segundos < 0) {
                        h3.segundos = h1.segundos - h2.segundos + 60;
                        h3.minutos -= 1;
                    }
                    else {
                        h3.segundos = h1.segundos - h2.segundos;
                    }
                    
                    if (h1.minutos - h2.minutos < 0) {
                        h3.minutos = h1.minutos - h2.minutos + 60;
                        h3.hora -= 1;
                    }
                    else {
                        h3.minutos = h1.minutos - h2.minutos;
                    }
                    
                    if (h1.hora - h2.hora < 0) {
                        h3.hora = h1.hora - h2.hora + 24;
                    }
                    else {
                        h3.hora = h1.hora - h2.hora;
                    }
                    
                    h3.comprobarHora();
                    h3.comprobarMinutos();
                    h3.comprobarSegundos();
                    
                    System.out.println(h1.toString() + " - " + h2.toString() + " = " + h3.toString());
                    break;
                default:
                    break;
            }
            
        }while(opcion != 0);
        
        System.out.println("\nPrograma Finalizado...");
    }
    
    public static int entradaEntero() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    public static void menuOperaciones() {
        System.out.println("************************************");
        System.out.println("*  MENU DE OPERACIONES CON HORAS:  *");
        System.out.println("*  1. Sumar horas                  *");
        System.out.println("*  2. Restar horas                 *");
        System.out.println("*                                  *");
        System.out.println("*  0. Salir                        *");
        System.out.println("************************************");
    }

}
