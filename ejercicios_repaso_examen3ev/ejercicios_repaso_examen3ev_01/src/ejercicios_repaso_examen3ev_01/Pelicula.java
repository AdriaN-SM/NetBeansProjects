/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_examen3ev_01;

/**
 *
 * @author adria
 */
public class Pelicula implements Comparable<Pelicula> {
    
    private String titulo;
    private String director;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    @Override
    public int compareTo(Pelicula o) {
        if (titulo.equals(o.getTitulo())) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Director: " + director;
    }
    
    
    
    
}
