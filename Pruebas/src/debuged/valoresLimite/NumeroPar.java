package debuged.valoresLimite;

import java.util.ArrayList;
import java.util.List;

public class NumeroPar {

    /**
     * Comprobar si el numero es par o no
     * @param numero
     * @return 
     */
    public Boolean esPar(Integer numero){
        return numero % 2 == 0;
    }
    
    
    public List<Integer> esParList(Integer max){
        List<Integer> listaPar = new ArrayList();
        for (int i = 0; i < max; i++) {
            if(esPar(i)){
                listaPar.add(i);
            }
        }
        return listaPar;
    }
  
}
