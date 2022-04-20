
package ejerciciodiagramaclases;

import java.util.ArrayList;
import java.util.List;

/**
 *
z
 */
public class EjercicioDIagramaClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Silla silla = new Silla("Primera silla");
        Pata pata = new Pata("Blanco", "Madera", "Pata 1", new Dimension(1.0, 1.0, 1.0), "Cilindrica");
        Pata pata2 = new Pata("Blanco", "Madera", "Pata 2", new Dimension(1.0, 1.0, 1.0), "Cilindrica");
        silla.addComponente(pata);
        silla.addComponente(pata2);

        
        
        
        
        
        
       
        
    }
    
}
