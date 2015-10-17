package text;

public class Texto extends Documento {

    @Override
    public void add(Componente componente) {
        if (componente.isChar()) {
            throw new UnsupportedOperationException();
        } else {
            this.componentes.add(componente);
        }
    }

    @Override
    public String dibujar(boolean isUpper) {
        String text = "";
        for (Componente componente : this.componentes) {
            text += componente.dibujar(isUpper);
        }
        text = isUpper ? text.toUpperCase() : text;
        return text + "---o---\n";
    }

}
