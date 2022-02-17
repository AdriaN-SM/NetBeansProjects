/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuged.tablaDecision;

/**
 *
 * @author jlopez
 */
public class TablaDecision {

    /*Una determinada instalación fabril está protegida contra incendios mediante 
     una línea de extintores de dióxido de carbono. La apertura de los extintores 
     se produce por la acción de un cilindro neumático de simple efecto, que al 
     ser accionado rompe elrecinto del depósito de CO2 Según el esquema que se 
     acompaña y las condiciones de funcionamiento siguientes:

        - La apertura de los extintores puede realizarse desde el exterior de la 
          instalación mediante la válvula distribuidora "a".
 
        - La línea de extintores puede activarse igualmente desde un centro de control, 
          mediante el distribuidor "b".
 
        - Por razones de seguridad, sólo es posible la puesta en funcionamiento 
          del sistema de extinción si la puerta de la instalación se halla cerrada 
         (captador “c” cerrado)
     */
    
    /**
     * Activacion de los extintores
     * 
     * @param a valvula distribuidora. true -> activados, false -> desactivados
     * @param b distribuidor. true -> activados, false -> desactivados
     * @param c puerta true -> puerta cerrada, false -> puerta abierta
     * @return 
     */
    public static Boolean activacionApertura(Boolean a, Boolean b, Boolean c) {

        if (c) {
            if (a || b) {
                return true;
            }
        }
        return false;
    }

}
