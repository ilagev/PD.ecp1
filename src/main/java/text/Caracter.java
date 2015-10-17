package text;

public class Caracter implements Componente {

    private char character;

    public Caracter(char character) {
        this.character = character;
    }

    @Override
    public void add(Componente componente) {
        // ignore
    }

    @Override
    public String dibujar(boolean isUpper) {
        String character = (new Character(this.character)).toString();
        return isUpper ? character.toUpperCase() : character;
    }

    @Override
    public boolean isChar() {
        return true;
    }

}
