package es.upm.miw.PD.ecp1.calculadora;

import upm.jbb.IO;

public class Calculadora {

    private int total;

    public void sumar() {
        total += IO.getIO().readInt();
    }

    public void restar() {
        total -= IO.getIO().readInt();
    }

    public void reset() {
        this.setTotal(0);
    }

    public void print() {
        IO.getIO().println(total);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
