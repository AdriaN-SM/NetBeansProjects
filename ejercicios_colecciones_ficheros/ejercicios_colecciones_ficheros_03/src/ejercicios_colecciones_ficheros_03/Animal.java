/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_ficheros_03;

import java.io.Serializable;

/**
 *
 * @author adria
 */
public class Animal implements Serializable {
    
    String raza;
    int numero_de_patas;

    public Animal(String raza, int numero_de_patas) {
        this.raza = raza;
        this.numero_de_patas = numero_de_patas;
    }

    @Override
    public String toString() {
        return "Raza: " + raza + ", Número de patas: " + numero_de_patas;
    }
    
    
}
