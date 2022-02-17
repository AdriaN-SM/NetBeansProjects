/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clases2_01;

/**
 *
 * @author adria
 */
public class Hora {
    int hora;
    int minutos;
    int segundos;
    String sHora;
    String sMinutos;
    String sSegundos;
    
    public Hora() {
        
    }

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public boolean comprobarHora() {
        if (this.hora >= 0 && this.hora <= 23) {
            sHora = hora + "";
            return true;
        }else {
            return false;
        }
    }
    
    public boolean comprobarMinutos() {
        if (this.minutos >= 0 && this.minutos <= 59) {
            sMinutos = minutos + "";
            return true;
        }else {
            return false;
        }
    }
    
    public boolean comprobarSegundos() {
        if (this.segundos >= 0 && this.segundos <= 59) {
            sSegundos = segundos + "";
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (sHora.length() == 1) {
            sHora = "0" + sHora;
        }
        if (sMinutos.length() == 1) {
            sMinutos = "0" + sMinutos;
        }
        if (sSegundos.length() == 1) {
            sSegundos = "0" + sSegundos;
        }
        String Hora = sHora + ":" + sMinutos + ":" + sSegundos;
        return Hora;
    }
    
}
