package Comportamiento.CadenaResponsabilidad;

public class ConcreteHandlerA extends Handler {

    @Override
    public String handleRequest(String request) {
        if (request.length() >= 10) {           //if request is eligible handle it
            return "ManejadorA manejando texto con longitud " + request.length();
        } else {
            return "Delego " + super.handleRequest(request);
        }
    }
}
