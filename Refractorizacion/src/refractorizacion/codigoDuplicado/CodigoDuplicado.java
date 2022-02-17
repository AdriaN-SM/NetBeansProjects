package refractorizacion.codigoDuplicado;

import javax.swing.text.Position;

/**
 * https://es.wikipedia.org/wiki/C%C3%B3digo_duplicado
 * https://www.codegrip.tech/productivity/what-is-duplicate-code/
 * https://www.excentia.es/copypastecodigo-duplicado
 * https://simpleprogrammer.com/types-of-duplication-in-code/
 */
public class CodigoDuplicado {

    private static class Player {

        private Position newPosition;

        public Player() {
        }

        private void Move(String n) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Position getNewPosition() {
            return newPosition;
        }
        
        
    }

    public class WalkPlayer {
        
        public Position WalkNorth() {
            return WalkMove("N");
        }

        private Position WalkMove(String Direccion) {
            Player player = new Player();
            player.Move(Direccion);
            return player.getNewPosition();
        }

        public Position WalkSouth() {
            return WalkMove("S");
        }

        public Position WalkEast() {
            return WalkMove("E");
        }

        public Position WalkWest() {
            return WalkMove("W");
        }

    }

    public class CalcMatrix {

        private int array_a[];
        private int array_b[];

        int calc_a() {
            return calculate(array_a);
        }

        private int calculate(int array[]) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += array[i];
            }
            int average_a = sum / 4;
            return average_a;
        }

        int calc_b() {
            return calculate(array_b);
        }
    }

}
