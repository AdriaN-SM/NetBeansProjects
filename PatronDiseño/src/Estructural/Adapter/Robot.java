
package Estructural.Adapter;


/*
   Adaptee
*/

class Robot {
    
    private Integer creacion;
    private String identificacion;

    public Integer getCreacion() {
        return creacion;
    }

    public void setCreacion(Integer creacion) {
        this.creacion = creacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Robot{" + "creacion=" + creacion + ", identificacion=" + identificacion + '}';
    }

}
