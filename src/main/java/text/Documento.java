package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Documento implements Componente {
    
    protected List<Componente> componentes;
    
    public Documento() {
        componentes = new ArrayList<Componente>();
    }
    
    public abstract void add(Componente componente);

    public abstract String dibujar(boolean isUpper);
    
    @Override
    public boolean isChar() {
        return false;
    }

}
