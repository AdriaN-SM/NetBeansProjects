/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_adrian_2ev;

/**
 *
 * @author adria
 */
public class Perro extends Animal implements Cazador {

    /**
     * Atributos
     */
    String genero;
    
    /**
     * Contructor para definir todos los atributos del perro
     * 
     * @param nombre Nombre del perro
     * @param edad Edad del perro
     * @param genero Género del perro
     */
    public Perro(String nombre, int edad, String genero) {
        super(nombre, 14);
        this.nivelAlimentacion = 2;
        this.genero = genero;
        this.edad = edad;
        
    }

    //GETTER Y SETTER
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /**
     * Método para saber si el perro es feliz
     * @return devuelve verdadero o falso dependiendo del nivel de alimentacion
     */
    @Override
    public boolean esFeliz() {
        
        if (nivelAlimentacion >= 4) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /**
     * Método que hace que un perro cace y se desgaste su nivel de alimentacion
     * solo si el perro tiene 3 años o más
     */
    @Override
    public void caza() {
        if (edad >= 3) {
            nivelAlimentacion = nivelAlimentacion -2;
            nivelAlimentacion = nivelAlimentacion + (int) (Math.random()*5);
        }
    }

    /**
     * Método para mostrar los atributos de un perro
     */
    @Override
    public void mostrar() {
        System.out.println("Nombre: " + this.getNombre() + " Genero: " + 
                            this.getGenero() + " Nivel alimentacion: " + 
                            this.nivelAlimentacion + " Edad: " + 
                            this.getEdad());
    }
    
}
