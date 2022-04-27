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
public class PizzaDecorador implements Pizza {

    protected Pizza pizza_especial;

    public PizzaDecorador(Pizza pizza_especial) {
        this.pizza_especial = pizza_especial;
    }
    
    @Override
    public String hacerPizza() {
        return pizza_especial.hacerPizza();
    }
    
}
