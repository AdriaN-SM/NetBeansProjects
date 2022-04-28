package Comportamiento.CadenaResponsabilidad;

public abstract class Handler {

    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public String handleRequest(String request) {
       // return (next != null ? next.handleRequest(request) : "(sin request)");
       if(next != null){
           return next.handleRequest(request);
       } else {
           return "sin request";
       }
    }
;

}
