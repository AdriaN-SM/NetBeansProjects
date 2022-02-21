/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_e_07;

/**
 *
 * @author adria
 */
public class Revista extends Publicacion {
    
    int numero;

    
    //Constructor con todos los atributos
    public Revista(String codigo, String titulo, int añoPubli, int numero) {
        super(codigo, titulo, añoPubli);
        this.numero = numero;
    }
    
    
}
