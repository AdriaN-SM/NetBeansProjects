
package Externo;

import java.util.Scanner;

/**
 *
 */
public class Externo {
    
    public String escritura(){
        
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text.trim();
        
    }
   
}
