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
public class Triangulo extends Figura {
    
    double base, lado1, lado2, altura;

    public Triangulo() {
    }

    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public Double perimetro() {
        return this.base + this.lado1 + this.lado2;
    }

    @Override
    public Double area() {
        return this.base * this.altura / 2;
    }

    @Override
    public void escalar(double escala) {
        this.base = this.base * escala;
        this.altura = this.altura * escala;
        this.lado1 = this.lado1 * escala;
        this.lado2 = this.lado2 * escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Triángulo");
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Lado1: " + this.lado1);
        System.out.println("Lado2: " + this.lado2);
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
    
}