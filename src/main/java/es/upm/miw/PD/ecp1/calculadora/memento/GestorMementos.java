package es.upm.miw.PD.ecp1.calculadora.memento;

import java.util.SortedMap;
import java.util.TreeMap;
import es.upm.miw.PD.ecp1.calculadora.GestorComando;

public class GestorMementos<T> extends GestorComando {

    private SortedMap<String, T> lista = new TreeMap<String, T>();

    public void addMemento(String key, T memento) {
        this.lista.put(this.lista.size() + ":" + key, memento);
    }

    public T getMemento(String key) {
        return this.lista.get(key); 
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);

    }
}
