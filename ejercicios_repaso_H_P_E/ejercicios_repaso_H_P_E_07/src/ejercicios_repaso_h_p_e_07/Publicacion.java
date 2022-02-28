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

    
    //Getter y Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAgnoPubli() {
        return agnoPubli;
    }

    public void setAgnoPubli(int agnoPubli) {
        this.agnoPubli = agnoPubli;
    }

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
