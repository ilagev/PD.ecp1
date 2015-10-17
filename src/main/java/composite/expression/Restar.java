package composite.expression;

public class Restar extends Operacion {

    public Restar(Expresion first, Expresion second) {
        super(first, second);
    }

    @Override
    public String toString() {
        return "(" + first.toString() + "-" + second.toString() + ")";
    }

    @Override
    public int operar() {
        return first.operar() - second.operar();
    }

}
