
package ejerciciodiagramaclases;

/**
 *
 */
public class Componente {
    
    private String color;
    private String material;
    private String descripcion;
    private Dimension dimension;
    private String forma;
    private Double area;
    private Double volumen;

    public Componente() {
    }

    public Componente(String color, String material, String descripcion, Dimension dimension, String forma) {
        this.color = color;
        this.material = material;
        this.descripcion = descripcion;
        this.dimension = dimension;
        this.forma = forma;
        this.area = 1.0;
        this.volumen = 1.0;
    }

    public String getColor() {
        return color;
    }

    public void pintar(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    
    
    @Override
    public String toString() {
        return "Componente{" + "color=" + color + ", material=" + material + ", descripcion=" + descripcion + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return obj instanceof Componente;
    }
    
    
    
}
