package cohesion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Operaciones que se ejecutan cuando surge un determinado evento, como la
 * aparicion de una excepcion
 */
public class Temporal {

    public Date crearFecha(Integer dia, Integer mes, Integer anno) {

        Date date = new GregorianCalendar(anno, mes, dia).getTime();
        return date;

    }

    public String mostrarFecha(Integer dia, Integer mes, Integer anno) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        try {
            date = new GregorianCalendar(anno, mes, dia).getTime();
        } catch (NullPointerException npe) {
            date = fechaDefecto();
        }
        return sdf.format(date);

    }
    
    private Date fechaDefecto(){
        return new GregorianCalendar(1, 1, 1).getTime();
    }
}
