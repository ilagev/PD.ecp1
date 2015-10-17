package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factoria = new FactoriaCaracter();

    private Map<Character, Caracter> mapping;

    private FactoriaCaracter() {
        this.mapping = new HashMap<Character, Caracter>();
    }

    public static FactoriaCaracter getFactoria() {
        return FactoriaCaracter.factoria;
    }

    public Componente get(char key) {
        if (!mapping.containsKey(key))
            mapping.put(key, new Caracter(key));
        return mapping.get(key);
    }

}
