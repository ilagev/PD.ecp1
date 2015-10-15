package calculadora.memento;

import calculadora.Calculadora;
import calculadora.Calculo;
import upm.jbb.IO;

public class Guardar extends Calculo {
    
    private GestorMementos<MementoCalculadora> gm;
    
    public Guardar(Calculadora calculadora, GestorMementos<MementoCalculadora> gm) {
        super(calculadora);
        this.gm = gm;
    }

    @Override
    public String name() {
        return "Guardar";
    }

    @Override
    public void execute() {
        this.gm.addMemento(IO.getIO().readString("Nombre del Memento"),
                           ((CalculadoraMementable) calculadora).createMemento());
    }

}
