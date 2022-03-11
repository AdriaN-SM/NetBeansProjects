/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej1_adrian_2ev;

/**
 *
 *
 *
 * @since 11.03.2022
 * Fecha de modificación: 11.03.2022
 * @author Adrian Solanas
 */
public class Ej1_Adrian_2ev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos el array de Futbolistas
        Futbolista[] arrF = new Futbolista[6];
        
        //Instanciamos los objetos de tipo Jugador
        Jugador j1 = new Jugador("Messi", 31, "delantero", 999, "10");
        Jugador j2 = new Jugador("Puyol", 44, "defensa", 15, "15");
        Jugador j3 = new Jugador("Puyol", 44, "defensa", 15, "15");
        
        //Instanciamos los objetos de tipo Portero
        Portero p1 = new Portero("Neur", 35, "portero", 50, "1");
        Portero p2 = new Portero("Areola", 28, "portero", 47, "25");
        Portero p3 = new Portero("Areola", 28, "portero", 47, "25");
        
        //Instanciamos los objetos de tipo Equipo
        Equipo e1 = new Equipo("Futbol Club Barcelona", 10);
        Equipo e2 = new Equipo("FC Bayern", 1000);
        
        //Asignamos cada Jugador y Portero a una posición del array de Futbolistas
        arrF[0] = j1;
        arrF[1] = j2;
        arrF[2] = j3;
        arrF[3] = p1;
        arrF[4] = p2;
        arrF[5] = p3;
        
        //Imprimimos el contenido del array
        System.out.println("CONTENIDO DEL ARRAY:");
        for (int i = 0; i < arrF.length; i++) {
            System.out.println(arrF[i].toString());
            System.out.println("---------------------------------------------");
        }
        
        System.out.println("\nAntes del cambio del dorsal del portero:");
        System.out.println(p1.toString());
        System.out.println("---------------------------------------------");
        p1.setDorsal("13");//establecemos el dorsal del p1 a 13
        System.out.println("Después del cambio del dorsal del portero:");
        System.out.println(p1.toString());
        System.out.println("---------------------------------------------");
        
        System.out.println("*************************************************");
        
        //Comparamos 2 jugadores (en este caso distintos)
        if (j1.equals(j3)) {
            System.out.println("Los jugadores son iguales:");
            System.out.println("Nombre: " + j1.getNombre() + " Dorsal: " + j1.getDorsal());
            System.out.println("---------------------------------------------");
        }
        else {
            System.out.println("Los jugadores son distintos:");
            System.out.println("El jugador 1 es:");
            System.out.println("Nombre: " + j1.getNombre() + " Dorsal: " + j1.getDorsal());
            System.out.println("El jugador 2 es:");
            System.out.println("Nombre: " + j3.getNombre() + " Dorsal: " + j3.getDorsal());
            System.out.println("---------------------------------------------");
        }
        System.out.println("*************************************************");
        
        //Comparamos 2 jugadores (en este caso idénticos)
        if (j2.equals(j3)) {
            System.out.println("Los jugadores son iguales:");
            System.out.println("Nombre: " + j2.getNombre() + " Dorsal: " + j2.getDorsal());
            System.out.println("---------------------------------------------");
        }
        else {
            System.out.println("Los jugadores son distintos:");
            System.out.println("El jugador 1 es:");
            System.out.println("Nombre: " + j2.getNombre() + " Dorsal: " + j2.getDorsal());
            System.out.println("El jugador 2 es:");
            System.out.println("Nombre: " + j3.getNombre() + " Dorsal: " + j3.getDorsal());
            System.out.println("---------------------------------------------");
        }
        
        int cont = 0;//variable para contar la cantidad de porteros que hay en el array
        
        //Recorremos el array y mostramos solo los porteros
        for (int i = 0; i < arrF.length; i++) {
            if (Equipo.esPortero(arrF[i])) {
                System.out.println(arrF[i].toString());
                cont++;//aumentamos el contador si el objeto es un portero
            }
        }
        //mostramos la cantidad de porteros que hay en el array
        System.out.println("De los 6 Futbolistas, hay " + cont + " porteros.");
        
        //Mostramos la información de los 2 equipos
        System.out.println("\nInformación de los equipos de la final:");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
        System.out.println("\nPrograma finalizado...");
        
    }

}
