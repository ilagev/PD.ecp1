package calculadora.memento;

import calculadora.Calculadora;
import calculadora.Calculo;
import upm.jbb.IO;

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
