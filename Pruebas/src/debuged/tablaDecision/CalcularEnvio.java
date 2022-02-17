package debuged.tablaDecision;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jlopez
 */
public class CalcularEnvio {

    /**
     * CalcularEnvio
     *
     * @param unidades número de unidades del producto
     * @param peninsula si el envío es a la peninsulta = true, o a las islas =
     * false
     * @param urgente si el envío es urgente = true, o no = false
     * @return precio del envio
     */
    public static Double calcularEnvio(Integer unidades, Boolean peninsula, Boolean urgente) {

        Double precioUnitario = 3.0;
        Double precioTotal = unidades * precioUnitario;

        if (unidades >=200 && unidades < 400) {
            if (peninsula) {
                precioTotal *= 0.95;
            }
        } else if (unidades > 599) {
            if (peninsula) {
                precioTotal *= 0.9;
            }
        }

        if (urgente) {
            if (peninsula) {
                precioTotal += 15.0;
            } else {
                precioTotal += 25.0;
            }
        }

        return precioTotal;

    }
}
