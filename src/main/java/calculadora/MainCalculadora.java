package calculadora;

import upm.jbb.IO;

public class MainCalculadora {
    
    private GestorComando gestor;

    public MainCalculadora() {
        Calculadora calculator = new Calculadora();
        this.gestor = new GestorComando();
        this.gestor.add(new Suma(calculator));
        this.gestor.add(new Restar(calculator));
        this.gestor.add(new Reset(calculator));
        this.gestor.add(new Print(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculadora());
    }

}
