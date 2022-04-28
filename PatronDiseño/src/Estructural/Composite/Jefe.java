package Estructural.Composite;

/*
Composite: representar la estructura jerarquica de una organizacion

     https://en.wikipedia.org/wiki/Composite_pattern
     https://www.geeksforgeeks.org/composite-design-pattern/
     https://migranitodejava.blogspot.com/search/label/Composite
 */
import java.util.ArrayList;

public class Jefe extends Empleado {

    private ArrayList<Empleado> componentList = new ArrayList<>();

    public Jefe(String departamento, Float sueldo) {
        super(departamento, sueldo);
    }

    public void add(Empleado component) {
        componentList.add(component);
    }

    public void remove(Empleado component) {
        componentList.remove(component);
    }

    @Override
    public String getrDepartamento() {
        String organigrama = "";
        organigrama += this.toString();
        for (Empleado c : componentList) {
            organigrama += "\n\t" + c.getrDepartamento();
        }
        return organigrama;
    }

    public Float getSueldo() {
        Float totalSueldo = sueldo;
        for (Empleado c : componentList) {
            totalSueldo += c.getSueldo();
        }
        return totalSueldo;
    }

    @Override
    public String toString() {
        return "Jefe {departamento de " + departamento + " con sueldo " + sueldo + " y sueldo departamento " + getSueldo() + '}';
    }

}
