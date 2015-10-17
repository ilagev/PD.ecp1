package composite.expression;

public class Sumar extends Operacion {
    
    public Sumar(Expresion first, Expresion second) {
        super(first, second);
    }

    @Override
    public String toString() {
        return "(" + first.toString() + "+" + second.toString() + ")";
    }

    @Override
    public int operar() {
        return first.operar() + second.operar();
    }

}
