    package debuged;

import java.io.Serializable;

/**
 * Como identificar los diferentes elementos que son serializables
 * y deprecated
 * 
 * este enlace no se muestra como hipervinculo
 * https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html
 * @serial Serializable la clase      
 * @author jLopez
 * @deprecated Porque este metodo ya no es valido
 */
public class DocumentacionSerialDeprecated implements Serializable{

    /**
     * número de unidades del producto 
     */
    private Integer unidades;
    /**
     * si el envío es a la peninsulta = true, o a las islas = false
     */
    private Boolean peninsula; 
    /**
     * si el envío es urgente = true, o no = false
     */
    private Boolean urgente;
    /**
     * valor unitario del producto
     * //@serialField Serializable el atributo
     * y que no reconozca la anotacion escrbiendo //
     */
    private Double precioUnitario;

    /**
     * Constructor vacío
     * @deprecated Porque este metodo ya no es valido
     */
    public DocumentacionSerialDeprecated() {
    }

    /**
     * Constructor con 3 parametros
     * 
     * @param unidades El numero de productos
     * @param peninsula La zona a la que envia
     * @param urgente La urgencia del envio
     */
    public DocumentacionSerialDeprecated(Integer unidades, Boolean peninsula, Boolean urgente) {
        this.unidades = unidades;
        this.peninsula = peninsula;
        this.urgente = urgente;
    }

    /**
     * Getter de unidades
     * @return unidades
     */
    public Integer getUnidades() {
        return unidades;
    }

    /**
     * Setter de unidades
     * @param unidades unidades
     */
    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    /**
     * Getter de peninsula
     * @return peninsula
     */
    public Boolean getPeninsula() {
        return peninsula;
    }

    /**
     * Setter de peninsula
     * @param peninsula peninsula
     */
    public void setPeninsula(Boolean peninsula) {
        this.peninsula = peninsula;
    }

    /**
     * Getter de urgente
     * @return urgente
     */
    public Boolean getUrgente() {
        return urgente;
    }

    /**
     * Setter de urgente
     * @param urgente urgente
     */
    public void setUrgente(Boolean urgente) {
        this.urgente = urgente;
    }

    /**
     * Getter de precioUnitario
     * @return precioUnitario
     */
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Set el precioUnitario
     * 
     * @param precioUnitario cantidad a asignar al precioUnitario
     */
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    /**
     * CalcularEnvio calcular el envio del envio.
     * Toda varialbe ha de tener antes un valor.
     * Metodo de instancia
     * @serialData Serializable el metodo
     * @return precio del envio
     */
    public Double calcularEnvio() {

        Double precioTotal = 0.0;
        
        if (unidades < 200) {
            precioTotal = unidades * precioUnitario;
        } else if (unidades < 400) {
            if (peninsula) {
                precioTotal = (unidades * precioUnitario) * 0.95;
            }
        } else if (unidades > 599) {
            if (peninsula) {
                precioTotal = (unidades * precioUnitario) * 0.9;
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
    
    /**
     * CalcularEnvio
     * Los unidades, peninsula y urgente han de tener un valor antes de llamar al método
     * o bien al crear la clase con el constructor o mediante setters correspondientes
     * Metodo de instancia
     * @deprecated Porque este metodo ya no es valido
     * @param precioUnitario valor unitario del producto
     * @return precio del envio
     */
    public Double calcularEnvio(Double precioUnitario) {

        Double precioTotal = 0.0;
        
        if (unidades < 200) {
            precioTotal = unidades * precioUnitario;
        } else if (unidades < 400) {
            if (peninsula) {
                precioTotal = (unidades * precioUnitario) * 0.95;
            }
        } else if (unidades > 599) {
            if (peninsula) {
                precioTotal = (unidades * precioUnitario) * 0.9;
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

    /**
     * CalcularEnvio
     * Metodo estatico, no hace falta generar una instancia de la clase para ser usado,
     * basta con usar el nombre de la clase
     * @param unidades número de unidades del producto
     * @param peninsula si el envío es a la peninsulta = true, o a las islas = false
     * @param urgente si el envío es urgente = true, o no = false
     * @return precio del envio
     */
    public static Double calcularEnvio(Integer unidades, Boolean peninsula, Boolean urgente) {

        Double precioUnitario = 3.0;
        Double precioTotal = 0.0;

        if (unidades < 200) {
            precioTotal = unidades * precioUnitario;
        } else if (unidades < 400) {
            if (peninsula) {
                precioTotal = (unidades * precioUnitario) * 0.95;
            }
        } else if (unidades > 599) {
            if (peninsula) {
                precioTotal = (unidades * precioUnitario) * 0.9;
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
