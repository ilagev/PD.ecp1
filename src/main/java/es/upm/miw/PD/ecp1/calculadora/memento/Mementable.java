package es.upm.miw.PD.ecp1.calculadora.memento;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
