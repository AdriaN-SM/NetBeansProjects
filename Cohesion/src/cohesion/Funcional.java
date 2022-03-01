package cohesion;


import java.util.List;


/**
 * Una clase que tiene un sentido, se usa para obtener la combicion
 */
public class Funcional {
    
    public class Combinatoria {

        private Maths maths = new Maths();

        public Integer combinacionSin(Integer numero, Integer comb) {

            if (numero < 1 || comb < 1) {
                return null;
            }

            Integer total = maths.factorial(numero) / maths.factorial(comb);

            return total;
        }

        public Integer variacionSin(Integer numero, Integer var) {

            if (numero < 1 || var < 1) {
                return null;
            }

            Integer total = combinacionSin(numero, numero - var);

            return total;
        }

        public Integer permutacionSin(Integer numero) {

            if (numero < 1) {
                return null;
            }

            Integer total = maths.factorial(numero);

            return total;
        }

        public Integer combinacionCon(Integer numero, Integer comb) {

            return combinacionSin(numero + comb - 1, comb);
        }

        public Integer variacionCon(Integer numero, Integer var) {

            if (numero < 1 || var < 1) {
                return null;
            }

            return (int) Math.pow(numero, var);
        }

        public Integer permutacionCon(Integer numero, List<Integer> lPer) {

            if (numero < 1) {
                return null;
            }
            
            Integer permutacion = 1;

            for (Integer i : lPer) {
                if (numero < i) {
                    return null;
                }
                permutacion *= maths.factorial(i);
            }

            Integer total = combinacionSin(numero,permutacion);

            return total;
        }

    }

    public class Maths {

        public Integer factorial(Integer i) {

            Integer factorial = 1;

            for (int j = 2; j <= i; j++) {
                factorial *= j;

            }

            return factorial;
        }

    }
}
