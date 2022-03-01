package Normal;

/**
 * https://www.infor.uva.es/~jvalvarez/teaching/ingenieria%20software/ptema9is1.pdf
 */
public class DatosInternos {

    public NumeroImaginario sumarNumerosImaginarios(NumeroImaginario i, NumeroImaginario j) {

        return new NumeroImaginario(i.real + j.real, i.imaginario + j.imaginario);

    }


    private class NumeroImaginario {

        private Double real;
        private Double imaginario;

        public NumeroImaginario(Double real, Double imaginario) {
            this.real = real;
            this.imaginario = imaginario;
        }

        public Double getReal() {
            return real;
        }

        public void setReal(Double real) {
            this.real = real;
        }

        public Double getImaginario() {
            return imaginario;
        }

        public void setImaginario(Double imaginario) {
            this.imaginario = imaginario;
        }

    }
}
