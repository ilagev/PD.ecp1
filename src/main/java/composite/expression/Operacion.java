package composite.expression;

public abstract class Operacion implements Expresion {

    protected Expresion first;

    protected Expresion second;

    public Operacion(Expresion first, Expresion second) {
        this.first = first;
        this.second = second;
    }

}
