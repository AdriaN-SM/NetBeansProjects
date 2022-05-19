/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_examen3ev_03;

/**
 *
 * @author adria
 */
public abstract class Automovil {
    
    private int numRuedas;
    private String tipoAutomovil;

    public Automovil(int numRuedas, String tipoAutomovil) {
        this.numRuedas = numRuedas;
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    
    
    public abstract boolean comprobar(String tipo);
}
