
package Estructural.Adapter;

/*
   Adapter  

  Adaptar una clase a otra primaria, envolverla en otra para que se pueda usar como 
  la clase primaria

   https://es.wikipedia.org/wiki/Adaptador_(patr%C3%B3n_de_dise%C3%B1o)
   https://www.geeksforgeeks.org/adapter-pattern/
   https://betterprogramming.pub/design-patterns-adapter-efb73c5090e6
   https://migranitodejava.blogspot.com/2011/06/adapter.html
*/

public class AdapterHumano implements Humano {

    private Robot adaptee;

    public AdapterHumano(Robot adaptee) {
        // we need reference to the object we 
        // are adapting 
        this.adaptee = adaptee;
    }

    @Override
    public Integer edad() {
        return adaptee.getCreacion();
    }

    @Override
    public String nombre() {
       return adaptee.getIdentificacion();
    }
    
     public void setEdad(Integer edad) {
        adaptee.setCreacion(edad);
    }

    public void setNombre(String nombre) {
        adaptee.setIdentificacion(nombre);
    }

    @Override
    public String toString() {
        return "Robot{" + "Edad=" + edad() + ", nombre=" + nombre() + '}';
    }
    

}
