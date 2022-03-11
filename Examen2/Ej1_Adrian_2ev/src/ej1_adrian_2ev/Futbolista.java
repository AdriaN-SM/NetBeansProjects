/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_adrian_2ev;

/**
 *
 * @author adria
 */
public abstract class Futbolista {
    
    /**
     * Atributos
     */
    String nombre;
    int edad;
    final String posicion;

    /**
     * Constructor por defecto con los atributos predefinidos
     */
    public Futbolista() {
        this.nombre = "Señor";
        this.edad = 30;
        this.posicion = "centrocampista";
    }

    /**
     * Constructor compuesto para definir los atributos del futbolista
     * 
     * @param nombre Nombre del futbolista
     * @param edad Edad del futbolista
     * @param posicion Posición en la que juega el futbolista
     */
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    //GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Métodos de la clase

    /**
     * Sobrecarga del método toString() para poder imprimir los atributos 
     * de los futbolistas
     * 
     * @return Devuelve una cadena con los atributos del futbolista
     */
    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + 
               " años, y juega de " + posicion;
    }
    
    /**
     * Sobreescritura del método equals() para poder comparar dos futbolistas
     * 
     * @param f El futbolista que queremos comparar con el futbolista que llama al método
     * @return Devuelve verdadero o falso dependiendo si los atributos de los 2
     * futbolistas coinciden exactamente
     */
    public boolean equals(Futbolista f) {
        if (this.getNombre().equals(f.getNombre()) &&
            this.getEdad() == f.getEdad() &&
            this.getPosicion().equals(f.getPosicion())) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /**
     * Método para saber si un futbolista puede jugar con las manos
     * 
     * @return Devuelve verdadero o falso dependiendo si es un portero o no
     */
    public abstract boolean jugarConLasManos();
    
}
