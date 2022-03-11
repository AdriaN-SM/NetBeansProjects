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
public class Jugador extends Futbolista {

    /**
     * Atributos
     */
    int golesMarcados;
    String dorsal;

    /**
     * Constructor para definir todos los atributos del Jugador
     * 
     * @param nombre Nombre del Jugador
     * @param edad Edad del Jugador
     * @param posicion Pocición en la que juega el Jugador
     * @param golesMarcados Total de goles marcados por el Jugador
     * @param dorsal Numero de dorsal que tiene el Jugador
     */
    public Jugador(String nombre, int edad, String posicion, int golesMarcados, String dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    /**
     * Constructor por defecto que usa el constructor de la clase padre y define
     * los atributos del Jugador por unos predeterminados
     */
    public Jugador() {
        super();
        this.golesMarcados = 69;
        this.dorsal = "8";
    }
    
    //GETTER Y SETTER

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }
    
    

    /**
     * Sobrecarga del método toString() para imprimir Jugadores usando el método
     * toString() de la clase padre y añadiendo los atributos de la clase Jugador
     * 
     * @return Devuelve una cadena con los atributos completos del Jugador
     */
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + " . Ha marcado " + golesMarcados + " gol(es)";
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
