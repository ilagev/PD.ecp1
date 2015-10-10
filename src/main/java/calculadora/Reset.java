package calculadora;

public class Reset extends Calculo {

    public Reset(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Reset";
    }

    @Override
    public void execute() {
        this.calculadora.reset();
    }

}
