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
public class Estrella extends CuerpoCeleste {

    public Estrella() {
    }

    public Estrella(String nombre, double masa, double diametro) {
        super(nombre, masa, diametro);
    }

    @Override
    public String toString() {
        return super.toString() + "Estrella: " + nombre + " | Masa: " + masa + " Kg | Diámetro: " + diametro + " m.";
    }

    
    
}
