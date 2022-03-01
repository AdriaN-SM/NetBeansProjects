package cohesion;


/**
 * Rrelacion vaga, del tipo cajon de sastre
 */
public class Casual {
    
    public class Utilidades{
        
        
        public Boolean esPositivo(Integer numero){
            return numero > 0;
        }
        
        public Integer factorial(Integer numero){
            Integer factorial = 1;
            for (int i = 0; i < numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
        
        public Boolean primo(Integer numero){
            
            for (int i = 0; i < numero/2; i++) {
                if(numero % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    
    
    
    

    
    
}
