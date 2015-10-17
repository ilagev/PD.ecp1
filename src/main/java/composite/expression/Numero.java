package composite.expression;

public class Numero implements Expresion {
    
    private int value;
    
    public Numero(int value) {
        this.value = value;
    }

    @Override
    public int operar() {
        return value;
    }

    @Override
    public String toString() {
        return (new Integer(value)).toString();
    }
    
}
