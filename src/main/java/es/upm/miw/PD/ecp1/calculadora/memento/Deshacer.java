package es.upm.miw.PD.ecp1.calculadora.memento;

import es.upm.miw.PD.ecp1.calculadora.Calculo;
import upm.jbb.IO;
import es.upm.miw.PD.ecp1.calculadora.Calculadora;

public class Deshacer extends Calculo {
    
    private GestorMementos<MementoCalculadora> gm;
    
    public Deshacer(Calculadora calculadora, GestorMementos<MementoCalculadora> gm) {
        super(calculadora);
        this.gm = gm;
    }

    @Override
    public String name() {
        return "Deshacer";
    }

    @Override
    public void execute() {
        ((CalculadoraMementable) calculadora).restoreMemento(
                this.gm.getMemento((String) IO.getIO().select(gm.keys(), "Restaurar")));
    }

}
