/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_examen3ev_01;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 *
 * @author adria
 */
public class ComparadorTitulo implements Comparator<Pelicula> {

    private Collator collator;
    
    public ComparadorTitulo() {
        this.collator = Collator.getInstance(new Locale("es"));
        collator.setStrength(Collator.TERTIARY);
    }
    
    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return collator.compare(o1.getTitulo(), o2.getTitulo());
    }
    
}
