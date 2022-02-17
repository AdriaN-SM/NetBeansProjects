/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_herenciapolimorfismo_02_interfaces;

/**
 *
 * @author adria
 */
public class Cuadrado extends Paralelogramo {

    double lado;

    public Cuadrado() {
    }
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public Double perimetro() {
        return this.lado*4;
    }

    @Override
    public Double area() {
        return this.lado*this.lado;
    }

    @Override
    public void escalar(double escala) {
        this.lado = this.lado * escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado");
        super.imprimir();
        System.out.println("Lado: " + this.lado);
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
    
}
