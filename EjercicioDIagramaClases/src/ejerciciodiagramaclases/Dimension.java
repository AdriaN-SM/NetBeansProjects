
package ejerciciodiagramaclases;

/**
 *
 */
public class Dimension {
    
    private Double altura;
    private Double anchura;
    private Double profundidad;

    public Dimension() {
    }

    public Dimension(Double altura, Double anchura, Double profundidad) {
        this.altura = altura;
        this.anchura = anchura;
        this.profundidad = profundidad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAnchura() {
        return anchura;
    }

    public void setAnchura(Double anchura) {
        this.anchura = anchura;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }
    
    
    
}
