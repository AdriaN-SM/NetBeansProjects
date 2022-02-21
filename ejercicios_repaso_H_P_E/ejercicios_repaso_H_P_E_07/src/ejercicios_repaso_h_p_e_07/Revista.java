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
    
    String numero;

    
    //Constructor con todos los atributos
    public Revista(String codigo, String titulo, int añoPubli, String numero) {
        super(codigo, titulo, añoPubli);
        this.numero = numero;
    }

    //Sobreescritura del método toString()
    @Override
    public String toString() {
        return super.toString() + " Revista ->  Código: " + codigo + " | Número: " + numero + " | Título: " + titulo + " | Año de publicación: " + agnoPubli;
    }

    //Sobreescritura del método equals()
    public boolean equals(Revista revista) {
        if (codigo.equals(revista.codigo) && titulo.equals(revista.titulo) && numero.equals(revista.numero)) {
            return true;
        }
        return false;
    }
    
    
}
