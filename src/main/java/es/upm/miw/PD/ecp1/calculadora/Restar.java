package es.upm.miw.PD.ecp1.calculadora;

public class Restar extends Calculo {

    public Restar(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Restar";
    }

    @Override
    public void execute() {
        this.calculadora.restar();
    }

}
