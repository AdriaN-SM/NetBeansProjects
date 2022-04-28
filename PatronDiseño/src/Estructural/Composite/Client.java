package Estructural.Composite;

public class Client {

    public static void main(String[] args) {

        Trabajador trabajadorVentas1 = new Trabajador("Trabajador Ventas1", 100f);
        Trabajador trabajadorVentas2 = new Trabajador("Trabajador Ventas2", 200f);
        Trabajador trabajadorVentas3 = new Trabajador("Trabajador Ventas3", 300f);
        Trabajador trabajadorFinanzas = new Trabajador("Trabajador finanzas", 400f);

        Jefe c2 = new Jefe("Jefe Ventas", 500f);
        c2.add(trabajadorVentas1);
        c2.add(trabajadorVentas2);
        c2.add(trabajadorVentas3);

        Jefe c3 = new Jefe("Jefe Finanzas", 1000f);
        c3.add(trabajadorFinanzas);

        Jefe presidente = new Jefe("Presidente", 5000f);
        presidente.add(c2);
        presidente.add(c3);

        System.out.println(presidente.getrDepartamento());
    }
}
