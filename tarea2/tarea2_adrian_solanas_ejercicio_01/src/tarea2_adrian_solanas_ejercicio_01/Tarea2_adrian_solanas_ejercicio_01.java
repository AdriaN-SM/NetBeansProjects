/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_adrian_solanas_ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Tarea2_adrian_solanas_ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fecha, dias, meses, años;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa comprueba la fecha que introduzcas.");
        System.out.println("El formato de la fecha debe ser dd-mm-aaaa (05-01-0123)");
        System.out.print("Introduce la fecha: ");
        fecha = in.nextLine();
        
        if (fecha.length() == 10) { // Filtramos la fecha por longitud para que coincida con la del formato de ejemplo
            if (fecha.charAt(2) == '-' && fecha.charAt(5) == '-') { // Comprobamos que haya 2 guiones en la posición 2 y 5
                dias = fecha.substring(0, 2); // hacemos una subcadena para guardar el dia
                meses = fecha.substring(3, 5); // hacemos una subcadena para guardar el mes
                años = fecha.substring(6); // hacemos una subcadena para guardar el año
                if (dias.charAt(0) >= '0' && dias.charAt(0) < '4' && dias.charAt(1) >= '0') { // filtramos los números que se pueden introducir en los 2 dígitos de la cadena dias
                    if (meses.charAt(0) == '0' || meses.charAt(0) == '1' && meses.charAt(1) >= '0' && meses.charAt(1) <= '2') { // filtramos los números que se pueden introducir en los 2 dígitos de la cadena meses
                        if (años.charAt(0) >= '0' && años.charAt(1) >= '0' && años.charAt(2) >= '0' && años.charAt(3) >= '0' ) { // filtramos los números que se pueden introducir en los 4 dígitos de la cadena años
                            int dia = Integer.valueOf(dias); // pasamos las variables dias, meses y años a integer
                            int mes = Integer.valueOf(meses);
                            int año = Integer.valueOf(años);
                            if (dia <= 0) { // si el día es menor o igual a 0
                                System.out.println("ERROR. El día debe ser superior a 0.");
                            }
                            else {
                                switch (mes) { // dependiendo del mes introducido comprobamos los días
                                    case 1: // enero
                                        if (dia <= 31) { // enero tiene 31 días como máximo, asi que los días deben ser menores o igual a 31
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else { // si los dias son superiores a 31, mensaje de error
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                                        }
                                        break; // terminamos el case
                                    case 2:
                                        if (dia <= 28) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 28 días. :(");
                                        }
                                        break;
                                    case 3:
                                        if (dia <= 31) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                                        }
                                        break;
                                    case 4:
                                        if (dia <= 30) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                                        }
                                        break;
                                    case 5:
                                        if (dia <= 31) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                                        }
                                        break;
                                    case 6:
                                        if (dia <= 30) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                                        }
                                        break;   
                                    case 7:
                                        if (dia <= 31) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                                        }
                                        break;    
                                    case 8:
                                        if (dia <= 31) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                                        }
                                        break;
                                    case 9:
                                        if (dia <= 30) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                                        }
                                        break;    
                                    case 10:
                                        if (dia <= 31) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                                        }
                                        break;    
                                    case 11:
                                        if (dia <= 30) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 30 días. :(");
                                        }
                                        break;    
                                    case 12:
                                        if (dia <= 31) {
                                            System.out.println("Fecha CORRECTA. :)");
                                        }
                                        else {
                                            System.out.println("Fecha INCORRECTA, el mes " + mes + " tiene 31 días. :(");
                                        }
                                        break;
                                    default: // en el caso de que se introduzca un 0 en el mes, mostramos un error.
                                        System.out.println("ERROR. El mes debe ser superior a 0.");
                                        break;
                                }
                            }
                            
                        }
                        else {
                            System.out.println("ERROR. Formato de año incorrecto.");
                        }
                    }
                    else {
                        System.out.println("ERROR. Formato de mes incorrecto.");
                    }
                }
                else {
                    System.out.println("ERROR. Formato de día incorrecto.");
                }
            }
            else {
                System.out.println("ERROR. Formato incorrecto. El formato de la fecha debe ser dd-mm-aaaa (05-01-0123)");
            }
        }
        else {
            System.out.println("ERROR. Formato incorrecto. El formato de la fecha debe ser dd-mm-aaaa (05-01-0123)");
        }
    }
}
