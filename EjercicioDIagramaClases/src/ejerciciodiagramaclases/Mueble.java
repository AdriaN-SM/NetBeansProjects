
package ejerciciodiagramaclases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Mueble {
    
    protected Dimension dimension;
    protected String descripcion;
    protected Double area;
    protected Double volumen;
    protected HashMap<Componente,List<Componente>> componentes;
    
    public Mueble() {
        componentes = new HashMap();
        this.area = 0.0;
        this.volumen = 0.0;
    }

    public Mueble(String descripcion) {
        this.descripcion = descripcion;
        componentes = new HashMap();
        this.area = 0.0;
        this.volumen = 0.0;
    }


    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public HashMap<Componente, List<Componente>> getComponentes() {
        return componentes;
    }

    public void addComponente(Componente componente) {
        System.out.println(this.componentes.containsKey(componente));
       if(!this.componentes.containsKey(componente)){
           this.componentes.put(componente, new ArrayList());
       }
       this.componentes.get(componente).add(componente);
       this.area += componente.getArea();
       this.volumen += componente.getVolumen();
    }
    
    public void removeComponente(Componente componente) {
       this.componentes.get(componente).remove(componente);
       this.area -= componente.getArea();
       this.volumen -= componente.getVolumen();
    }
    
    private Double calcularArea(){
        Double a = 0.0;
          for (Map.Entry<Componente,List<Componente>> entry : componentes.entrySet()){
              for(Componente c : entry.getValue()){
                  a += c.getArea();
              }
          } 
        return a;
    }
    
    private Double calcularVolumen(){
        Double v = 0.0;
          for (Map.Entry<Componente,List<Componente>> entry : componentes.entrySet()){
              for(Componente c : entry.getValue()){
                  v += c.getVolumen();
              }
          } 
        return v;
    }

    @Override
    public String toString() {
        return "Mueble{" + "dimension=" + dimension + ", descripcion=" + descripcion + ", area=" + area + ", volumen=" + volumen + ", componentes=" + componentes + '}';
    }
 
}
