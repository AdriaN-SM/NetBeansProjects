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
public class Libro {
    
    private Isbn isbn;
    private String titulo;
    private String autor;
    private String materia;
    
    private static String[] arrMaterias = 
    {"Ciencia", 
    "Ocio", 
    "Literatura", 
    "Poesía", 
    "Pensamiento", 
    "Técnica", 
    "Geografía", 
    "Política", 
    "Sociedad"};

    public Libro(String titulo, String autor, int materia) {
        this.isbn = new Isbn();
        this.titulo = titulo;
        this.autor = autor;
        this.materia = arrMaterias[materia-1];
    }
    
}
