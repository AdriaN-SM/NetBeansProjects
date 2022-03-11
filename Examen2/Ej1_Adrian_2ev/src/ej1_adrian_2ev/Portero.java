/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_adrian_2ev;

/**
 *
 * @author adria
 */
public class Portero extends Futbolista {

    /**
     * Atributos
     */
    int golesEncajados;
    String dorsal;

    /**
     * Constructor por defecto que usa el constructor por defecto de la clase
     * padre y establece el dorsal en 1 para el Portero
     */
    public Portero() {
        super();
        this.dorsal = "1";
    }

    /**
     * Contructor compuesto para definir todos los atributos del Portero
     * utilizando también el constructor de la clase padre
     * 
     * @param nombre Nombre del portero
     * @param edad Edad del portero
     * @param posicion Posición del portero (por defecto Portero)
     * @param golesEncajados Cantidad de goles que ha marcado el portero
     * @param dorsal Numero de dorsal que tiene el portero
     */
    public Portero(String nombre, int edad, String posicion, int golesEncajados, 
            String dorsal) {
        super(nombre, edad, posicion);
        this.golesEncajados = golesEncajados;
        this.dorsal = dorsal;
    }
    
    //GETTER Y SETTER

    public int getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados(int golesEncajados) {
        this.golesEncajados = golesEncajados;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }
    
    

    /**
     * Sobrecarga del método toString() para imprimir porteros
     * 
     * @return Devuelve una cadena con los atributos completos del portero
     */
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal;
    }
    
    
    /**
     * Método abstracto heredado de Futbolista
     * 
     * @see #jugarConLasManos()
     * @return Devuelve verdadero o falso dependiendo si es un portero o no
     */
    @Override
    public boolean jugarConLasManos() {
        if (Equipo.esPortero(this)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
