package calculadora;

public abstract class Calculo implements Comando {
    
    protected Calculadora calculadora;
    
    public Calculo(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
    @Override
    public String toString() {
        return this.name();
    }

}
