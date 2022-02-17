/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_excepciones_01;

/**
 *
 * @author adria
 */
public class Alumnos {
    String nombre;
    int edad;
    double altura;

    public Alumnos() {
    }

    public Alumnos(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public static Alumnos mayor(Alumnos a1, Alumnos a2) {
        if(a1.edad >a2.edad)
                return a1;
        else if(a2.edad>a1.edad)
                return a2;
        else
                return null;

    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura;
    }
    
    
}
