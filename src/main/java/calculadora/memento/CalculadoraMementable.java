package calculadora.memento;

import calculadora.Calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora> {

    @Override
    public MementoCalculadora createMemento() {
        return new MementoCalculadora(this.getTotal());
    }

    @Override
    public void restoreMemento(MementoCalculadora memento) {
        this.setTotal(memento.getValor());
    }

}
