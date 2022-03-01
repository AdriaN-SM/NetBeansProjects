package Normal;

/**
 *
 */
public class Estampado {

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

        public NumeroImaginario sumarNumerosImaginarios(NumeroImaginario i, NumeroImaginario j) {

            return new NumeroImaginario(i.getReal() + j.getReal(), i.getImaginario() + j.getImaginario());

        }

    }
}
