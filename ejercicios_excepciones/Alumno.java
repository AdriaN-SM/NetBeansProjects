/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_excepcionesv2;

/**
 *
 * @author Rufino
 */
public class Alumno {
    
    private String nombre;
	private int edad;
	private int altura;
	
	Alumno(String nombre, int edad, int altura){
		this.nombre= nombre;
		this.edad = edad;
		this.altura = altura;
	}
	
	public static Alumno mayor(Alumno a1, Alumno a2) {
		if(a1.edad >a2.edad)
			return a1;
		else if(a2.edad>a1.edad)
			return a2;
		else
			return null;
					
	}
	
	@Override
	public String toString() {
		return nombre + " tiene " + edad + " años y mide " + altura;
	}
}


