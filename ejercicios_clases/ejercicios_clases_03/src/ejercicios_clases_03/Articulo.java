/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clases_03;

/**
 *
 * @author adria
 */
public class Articulo {
    
    String nombre;
    int stock;
    double precio;
    final double iva = 1.21;
    double PVP;
    
    
    protected Articulo() {
        
    }
    
    protected Articulo(String nom, int stk, double pre) {
        this.nombre = nom;
        this.stock = stk;
        this.precio = pre;
        this.PVP = this.CaluclarPVP();
    }
    
    protected void mostrarInformacion() {
        System.out.println("Información del artículo:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio (sin IVA): " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("P.V.P: " + PVP);
    }
    
    private double CaluclarPVP() {
        return this.precio*this.iva;
    }
    
    protected double CalcularPVPDescuento(double descuento) {
        return this.PVP*(1-(descuento/100));
    }
    
    protected boolean vender(int cantidad) {
        if (cantidad <= this.stock ) {
            this.setStock(this.stock-cantidad);
            return true;
        }else {
            System.out.println("No hay suficiente stock para vender :(");
            return false;
        }
    }
    
    protected boolean almacenar(int cantidad) {
        if (cantidad > 0) {
            this.setStock(this.stock+cantidad);
            return true;
        }else {
            System.out.println("No es posible almacenar unidades negativas :(");
            return false;
        }
    }
    
    // Método toString
    
    public String toString() {
        String articulo = "Nombre: " + this.nombre +
        " Precio: " + this.precio + " Stock: " + this.stock +
        " PVP: " + this.PVP;
        return articulo;
    }
    
    
    // Inicio de Métodos Getter y Setter

    protected String getNombre() {
        return nombre;
    }

    protected int getStock() {
        return stock;
    }

    protected double getPrecio() {
        return precio;
    }
    
    protected double getPVP() {
        return PVP;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setStock(int stock) {
        this.stock = stock;
    }

    protected void setPrecio(double precio) {
        this.precio = precio;
    }
    
    protected void setPVP(double PVP) {
        this.PVP = PVP;
    }
    
    
    
}
