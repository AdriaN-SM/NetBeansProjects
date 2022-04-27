/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_adriansolanas;

/**
 *
 * @author adria
 */
public class Libros {
    
    private int isbn;
    private String titulo;
    private String autor;
    private String materia;
    
    private String[] arrMaterias = 
    {"Ciencia", 
    "Ocio", 
    "Literatura", 
    "Poesía", 
    "Pensamiento", 
    "Técnica", 
    "Geografía", 
    "Política", 
    "Sociedad"};

    public Libros() {
    }

    public Libros(int isbn, String titulo, String autor, String materia) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.materia = materia;
    }
    
    
    
}
