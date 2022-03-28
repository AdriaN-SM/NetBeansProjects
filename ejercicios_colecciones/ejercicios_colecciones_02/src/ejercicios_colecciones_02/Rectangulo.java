/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones_02;

/**
 *
 * @author adria
 */
public class Rectangulo extends Paralelogramo {
    
    double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo() {
    }

    @Override
    public Double perimetro() {
        return this.ancho*2 + this.alto*2;
    }

    @Override
    public Double area() {
        return this.ancho*this.alto;
    }

    @Override
    public void escalar(double escala) {
        this.ancho = this.ancho * escala;
        this.alto = this.alto * escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Rectángulo");
        super.imprimir();
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Alto: " + this.alto);
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
    
}
