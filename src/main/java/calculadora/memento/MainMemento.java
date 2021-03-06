package calculadora.memento;

import calculadora.GestorComando;
import calculadora.Print;
import calculadora.Reset;
import calculadora.Restar;
import calculadora.Suma;
import upm.jbb.IO;

public class MainMemento {
    
    private GestorComando gestor;
    
    private GestorMementos<MementoCalculadora> gm = new GestorMementos<MementoCalculadora>();
    
    public MainMemento() {
        CalculadoraMementable calculator = new CalculadoraMementable();
        this.gestor = new GestorComando();
        this.gestor.add(new Suma(calculator));
        this.gestor.add(new Restar(calculator));
        this.gestor.add(new Reset(calculator));
        this.gestor.add(new Print(calculator));
        this.gestor.add(new Guardar(calculator, gm));
        this.gestor.add(new Deshacer(calculator, gm));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainMemento());
    }

}
