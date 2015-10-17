package composite.expression;

public class Multiplicar extends Operacion {
    
    public Multiplicar(Expresion first, Expresion second) {
        super(first, second);
    }

    @Override
    public String toString() {
        return "(" + first.toString() + "*" + second.toString() + ")";
    }

    @Override
    public int operar() {
        return first.operar() * second.operar();
    }

}
