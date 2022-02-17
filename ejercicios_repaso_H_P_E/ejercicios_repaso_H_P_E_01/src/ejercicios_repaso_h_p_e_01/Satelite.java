/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_e_01;

/**
 *
 * @author adria
 */
public class Satelite extends CuerpoCeleste {

    public Satelite() {
    }

    public Satelite(String nombre, double masa, double diametro, double periodoRotacion) {
        super(nombre, masa, diametro, periodoRotacion);
    }

    @Override
    public String toString() {
        return super.toString() + "Satélite: " + nombre + " | Masa: " + masa + " Kg | Diámetro: " + diametro + " m | Periodo de rotación: " + periodoRotacion + " días terrestres.";
    }

    
    
}
