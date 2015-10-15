package calculadora;

public class Suma extends Calculo {

    public Suma(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        this.calculadora.sumar();
    }

}
