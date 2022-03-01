package Normal;

/**
 *
 */
public class Control {

    public Integer caluclar(Integer a, Integer b, Character operacion) {

        switch (operacion) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;

        }

    }

}
