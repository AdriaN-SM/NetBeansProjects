/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clases2_04;

/**
 *
 * @author adria
 */
public class Fecha {
    //ATributos
    
    int dia;
    int mes;
    int agno;

    //Constructor
    public Fecha(int dia, int mes, int agno) {
        this.dia = dia;
        this.mes = mes;
        this.agno = agno;
    }
    
    //Métodos
    public boolean esBisiesto(){
        boolean correcto = false;
        
        if((agno % 4 == 0 && agno % 100 != 0) || agno % 400 == 0){
            correcto = true;
                    
        }else{
            correcto = false;
        }
        
        return correcto;
    }
    
    int getDiasMes() {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (esBisiesto()) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }//del switch
    }
 
    
    public boolean esCorrecta() {
        
        boolean correcta = true;
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            correcta = false;
        } else {
            if (dia > getDiasMes()) {
                correcta = false;
            }
        }
        return correcta;
    }
    
    public String getCadenaMes(){
        
        String mesLetra=null;
        
        switch(mes){
            case 1:
                mesLetra = "Enero";
                break;
            case 2:
                mesLetra = "Febrero";
                break;
            case 3:
                mesLetra = "Marzo";
                break;
            case 4:
                mesLetra = "Abril";
                break;
            case 5:
                mesLetra = "Mayo";
                break;
            case 6:
                mesLetra = "Junio";    
                break;
            case 7:
                mesLetra = "Julio";
                break;
            case 8:
                mesLetra = "Agosto";
                break;
            case 9:
                mesLetra = "Septiembre";
                break;
            case 10:
                mesLetra = "Octubre";
                break;
            case 11:
                mesLetra = "Noviembre";    
                break;
            case 12:
                mesLetra = "Diciembre";      
                break;
        }
        
        return mesLetra;
    }
    
     String getCadenaFecha2(){
        return String.format("%d-%d-%d",dia,mes,agno);
    }
}
