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
public class Circulo extends Figura {
    
    double radio;
    final double pi = 3.1415;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public Double perimetro() {
        return 2 * pi * this.radio;
    }

    @Override
    public Double area() {
        return pi * (this.radio * this.radio);
    }

    @Override
    public void escalar(double escala) {
        this.radio = this.radio * escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Círculo");
        System.out.println("Radio: " + this.radio);
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
    
    
    
}
