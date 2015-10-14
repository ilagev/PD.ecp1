package es.upm.miw.PD.ecp1.calculadora;

public class Print extends Calculo {

    public Print(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Print";
    }

    @Override
    public void execute() {
        this.calculadora.print();
    }

}
