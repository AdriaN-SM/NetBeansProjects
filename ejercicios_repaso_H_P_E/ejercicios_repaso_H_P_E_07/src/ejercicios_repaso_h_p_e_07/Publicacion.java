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
public class Publicacion {
    
    String codigo;
    String titulo;
    int agnoPubli;

    //Constructor con todos los atributos
    public Publicacion(String codigo, String titulo, int agnoPubli) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.agnoPubli = agnoPubli;
    }

    @Override
    public String toString() {
        return "Publicacion -> ";
    }
    
}
