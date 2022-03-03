/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_repaso2_01;

/**
 *
 * @author adria
 */
public class Moderador extends Usuarios {
    
    int papelera;

    public Moderador(String correo, String nick) {
        super(correo, nick);
        this.papelera = 0;
    }

    public int getPapelera() {
        return papelera;
    }

    public void setPapelera(int papelera) {
        this.papelera = papelera;
    }
    
    
}
