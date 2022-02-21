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
public class Libro extends Publicacion implements Prestable {

    boolean prestado;

    //Constructor con toods los atributos
    public Libro(String codigo, String titulo, int agnoPubli) {
        super(codigo, titulo, agnoPubli);
        this.prestado = false;
    }
    
    
    //Métodos implementados de la interfaz
    @Override
    public void prestar() {
        prestado = true;
        System.out.println("Libro prestado.");
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("Libro devuelto.");
    }

    @Override
    public String prestado() {
        if (prestado) {
            return "El libro está prestado.";
        }
        else {
            return "El libro no está prestado.";
        }
    }

    //Sobreescritura del método equals()
    public boolean equals(Libro libro) {
        if (codigo.equals(libro.codigo) && titulo.equals(libro.titulo)) {
            return true;
        }
        return false;
    }

    //Sobreescritura del método toString()
    @Override
    public String toString() {
        return super.toString() + " Libro ->  Código: " + codigo + " | Título: " + titulo + " | Año de publicación: " + agnoPubli + " | Prestado: " + prestado();
    }
    
    
}
