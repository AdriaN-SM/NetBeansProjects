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
    public Libro(String codigo, String titulo, int añoPubli) {
        super(codigo, titulo, añoPubli);
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
    public void prestado() {
        if (prestado) {
            System.out.println("El libro ya está prestado.");
        }
        else {
            System.out.println("El libro no está prestado.");
        }
    }
    
}
