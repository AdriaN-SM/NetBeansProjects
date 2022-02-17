/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_e_01;

import java.util.Objects;

/**
 *
 * @author adria
 */
public class CuerpoCeleste {
    double masa;
    double diametro;
    double periodoRotacion;
    String nombre;

    public CuerpoCeleste() {
    }

    public CuerpoCeleste(String nombre, double masa, double diametro, double periodoRotacion) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
    }

    public CuerpoCeleste(String nombre, double masa, double diametro) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    @Override
    public String toString() {
        return "Cuerpo celeste -> ";
    }
    
    
    public boolean equals(CuerpoCeleste cuerpo) {
        
        if (Double.doubleToLongBits(this.periodoRotacion) != Double.doubleToLongBits(cuerpo.getPeriodoRotacion())) {
            return false;
        }
        if (!cuerpo.getNombre().equals(this.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}
