/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_diseño_bridge;

/**
 *
 * @author adria
 */
public class TomateDecorador extends PizzaDecorador {
    
    public TomateDecorador(Pizza pizza_especial) {
        super(pizza_especial);
    }
    
    public String hacerPizza() {
        return pizza_especial.hacerPizza() + addTomate();
    }
    
    public String addTomate() {
        return " + tomate";
    }
}
