/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_examen3ev_02;

import java.io.Serializable;

/**
 *
 * @author adria
 */
public class Isbn implements Serializable {
    
    private final String isbnCad = "ISBN";
    private int isbnValor;

    public Isbn(int isbnValor) {
        this.isbnValor = isbnValor;
    }

    public int getIsbnValor() {
        return isbnValor;
    }

    public void setIsbnValor(int isbnValor) {
        this.isbnValor = isbnValor;
    }

    public String getIsbnCad() {
        return isbnCad;
    }

    @Override
    public String toString() {
        return isbnCad + "-" + isbnValor;
    }
    
    
}
