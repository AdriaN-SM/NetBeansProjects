/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_caja_negra;

/**
 *
 * @author Adrian Solanas
 */
public class Persona {
    
    int edad;
    
    Persona() {};
    
    Persona(Integer edad) {
        this.edad = edad;
    }
    
    Boolean mayorEdad(Integer edad) {
        if (edad >= 18) {
            return true;
        }
        return false;
        
    }
    
}
