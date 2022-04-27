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
public class BaconDecorador extends PizzaDecorador {
    
    public BaconDecorador(Pizza pizza_especial) {
        super(pizza_especial);
    }
    
    public String hacerPizza() {
        return pizza_especial.hacerPizza() + addBacon();
    }
    public String addBacon() {
        return " + bacon crujiente";
    }
    
}
