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
public class Coche extends Automovil {
    
    private String marca;
    private String modelo;
    
    public Coche(String marca, String modelo, String tipoAutomovil) {
        super(4, tipoAutomovil);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    @Override
    public boolean comprobar(String tipo) {
        if (tipo.equals("coche")) {
            return true;
        }
        return false;
    }
    
    
}
