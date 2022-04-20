
package Comportamiento.CadenaResponsabilidad;

public class ConcreteHandlerB extends Handler{
 
    @Override
    public String handleRequest(String request) {
        if (request.length() >= 0) {           //if request is eligible handle it
            return "ManejadorB manejando texto con longitud " + request.length()    ;
        } else {
            return "Delego " + super.handleRequest(request);
        }
    }
}
