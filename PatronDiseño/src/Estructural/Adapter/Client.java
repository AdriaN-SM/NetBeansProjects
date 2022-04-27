
package Estructural.Adapter;

public class Client {

    public static void main(String[] args) {
        
        Robot robot = new Robot();
        robot.setCreacion(23);
        robot.setIdentificacion("JJ Agustin");
        System.out.println(robot);
        
        AdapterHumano adapter = new AdapterHumano(new Robot());

        adapter.setEdad(23);
        adapter.setNombre("JJ Agustin");
        System.out.println(adapter);

    }

}
