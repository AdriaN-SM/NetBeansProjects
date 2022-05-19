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
public class Moto extends Automovil{

    private String marca;
    private String modelo;

    public Moto(String marca, String modelo, int numRuedas, String tipoAutomovil) {
        super(numRuedas, tipoAutomovil);
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
    @Override
    public boolean comprobar(String tipo) {
        if (tipo.equals("moto")) {
            return true;
        }
        return false;
    }
    
}
