/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion.Prototype;

/**
 *
 * @author ChimoB
 */
public class SpecificPrototype1 extends Prototype {

    public SpecificPrototype1() {
        type = "Type1";
    }

    
    
    @Override
    void method() {
        System.out.println("Metodo para hacer algo con el tipo 1");
    }
    
}
