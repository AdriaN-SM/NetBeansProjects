package Estructural.Decorator;

/**
 * Component
 */
public abstract class Tropa {

    protected Integer vida;
    protected Integer movimiento;
    protected Integer ataque;
    protected Integer defensa;

    public Tropa(Integer ataque, Integer defensa) {
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public Tropa(Integer vida, Integer movimiento, Integer ataque, Integer defensa) {
        this.vida = vida;
        this.movimiento = movimiento;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Integer movimiento) {
        this.movimiento = movimiento;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    @Override
    public abstract String toString();
    
    
}
