/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_excepciones_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *
 *
 * @since 09.02.2022
 * Fecha de modificación: 09.02.2022
 * @author Adrian Solanas
 */
public class Ejercicios_excepciones_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        Alumnos alumno1, alumno2;
		String nombre1, nombre2;
		int edad1 = 0, edad2 = 0, altura1 = 0, altura2 = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		boolean correcto;
		try {
			System.out.println("Datos del alumno 1");
			System.out.print("Nombre: ");
			nombre1 = teclado.readLine();
			do {
				System.out.print("Edad: ");
				try {
					edad1 = Integer.parseInt(teclado.readLine());
					correcto = true;
				}
				catch(NumberFormatException e) {
					System.out.println("Error, dato no numérico.");
					correcto = false;
				}
			}while(!correcto);
			do {
				System.out.print("Altura (cm.): ");
				try {
					altura1 = Integer.parseInt(teclado.readLine());
					correcto = true;
				}
				catch(NumberFormatException e) {
					System.out.println("Error, dato no numérico.");
					correcto = false;
				}
			}while(!correcto);
			alumno1 = new Alumnos(nombre1, edad1, altura1);
			System.out.println("Datos del alumno 2");
			System.out.print("Nombre: ");
			nombre2 = teclado.readLine();
			do {
				System.out.print("Edad: ");
				try {
					edad2 = Integer.parseInt(teclado.readLine());
					correcto = true;
				}
				catch(NumberFormatException e) {
					System.out.println("Error, dato no numérico.");
					correcto = false;
				}
			}while(!correcto);
			do {
				System.out.print("Altura (cm.): ");
				try {
					altura2 = Integer.parseInt(teclado.readLine());
					correcto = true;
				}
				catch(NumberFormatException e) {
					System.out.println("Error, dato no numérico.");
					correcto = false;
				}
			}while(!correcto);
			alumno2 = new Alumnos(nombre2, edad2, altura2);
			System.out.println("Datos alumno 1: " + alumno1.toString());
			System.out.println("Datos alumno 2: " + alumno2.toString());
			Alumnos mayor = Alumnos.mayor(alumno1, alumno2);
			if(mayor == null)
				System.out.println("Los dos tienen la misma edad");
			else
				System.out.println("El mayor es: " + mayor.toString());
		}
		catch(IOException e) {
			System.out.print("Error de entrada/salida");
		}
	}
}