/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_adrian;

import java.util.Scanner;

/**
 *
 * @author adrian solanas
 */
public class Ejercicio4_adrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeroAlumno = 1, edad, altura, sumaEdad = 0, edad1 = 0, edad2 = 0, 
                edad3 = 0, edad4 = 0, edad5 = 0, altura1 = 0, altura2 = 0, 
                altura3 = 0, altura4 = 0, altura5 = 0, i = 0, j = 0, chicos = 0, 
                chicas = 0;
        String nombre, sexo;
        
        
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║     BIENVENIDO al programa de estadísticas de alumnos     ║");
        System.out.println("║                                                           ║");
        System.out.println("║ Debes introducir los datos de 5 alumnos: el nombre del    ║");
        System.out.println("║ alumno, edad, altura y sexo (H o M) para posteriormente   ║");
        System.out.println("║ mostrar la edad media de la clase, los alumnos mayores de ║");
        System.out.println("║ 18 años que hay en la clase, los alumnos que miden menos  ║");
        System.out.println("║ de 1,80 y el número de chicos y chicas de la clase.       ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        while (numeroAlumno < 6) {
            System.out.println(" Datos del/la alumno/a nº " + numeroAlumno);
            System.out.print("  Nombre del/la alumno/a: ");
            nombre = in3.nextLine();
            System.out.println("");
            do {
                System.out.print("  Sexo del/la alumno/a (H = hombre  M = mujer): ");
                sexo = in2.nextLine();
                System.out.println("");
                sexo = sexo.toUpperCase();
                if (sexo.charAt(0) != 'H' && sexo.charAt(0) != 'M') {
                    System.out.println("ERROR. Elije una de las 2 opciones que se te dan a continuación:");
                }
            } while (sexo.charAt(0) != 'H' && sexo.charAt(0) != 'M');
            System.out.print("  Edad en años del/la alumno/a: ");
            edad = in.nextInt();
            System.out.println("");
            System.out.print("  Altura del/la alumno/a en centímetros: ");
            altura = in.nextInt();
            System.out.println("");
            System.out.println("╠═══════════════════════════════════════════════════════════╣");
            
            // Calculos
            sumaEdad = sumaEdad + edad;
            
            switch (numeroAlumno) {
                case 1:
                    edad1 = edad;
                    altura1 = altura;
                    break;
                case 2:
                    edad2 = edad;
                    altura2 = altura;
                    break;
                case 3:
                    edad3 = edad;
                    altura3 = altura;
                    break;
                case 4:
                    edad4 = edad;
                    altura4 = altura;
                    break;
                case 5:
                    edad5 = edad;
                    altura5 = altura;
                    break;
            }
            if (sexo.charAt(0) == 'H') {
                chicos++;
            }
            else if (sexo.charAt(0) == 'M') {
                chicas++;
            }
            
            numeroAlumno++;
        }
        // calculos
        if (edad1 >= 18) {
            i++;
        }
        if (edad2 >= 18) {
            i++;
        }
        if (edad3 >= 18) {
            i++;
        }
        if (edad4 >= 18) {
            i++;
        }
        if (edad5 >= 18) {
            i++;
        }
        
        if (altura1 < 180) {
            j++;
        }
        if (altura2 < 180) {
            j++;
        }
        if (altura3 < 180) {
            j++;
        }
        if (altura4 < 180) {
            j++;
        }
        if (altura5 < 180) {
            j++;
        }
        
        System.out.println("║                                                           ║");
        System.out.println("║                  CALCULOS DE LOS ALUMNOS                  ║");
        System.out.println("║                                                           ║");
        System.out.println("║ Edad media de la clase: " + sumaEdad/5 + "                                ║");
        System.out.println("║ Número de alumnos/as mayores de 18 años: " + i + "                ║");
        System.out.println("║ Número de alumnos/as que miden menos de 180 cm: " + j + "         ║");
        System.out.println("║ Número de chicas: " + chicas + "                                       ║");
        System.out.println("║ Número de chicos: " + chicos + "                                       ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }
    
}
