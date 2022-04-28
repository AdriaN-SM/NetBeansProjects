/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_ficheros_02;

import java.io.Serializable;

/**
 *
 * @author adria
 */
public class Coche implements Serializable {
    
    private String modelo;
    private String marca;

    public Coche(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Marca: " + marca;
    }
    
}
