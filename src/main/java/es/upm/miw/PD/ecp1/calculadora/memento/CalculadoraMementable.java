package es.upm.miw.PD.ecp1.calculadora.memento;

import es.upm.miw.PD.ecp1.calculadora.Calculadora;

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
