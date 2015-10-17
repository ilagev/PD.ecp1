package factoryMethod.naturalNumber;

import upm.jbb.IO;

public class FactoryMethodMain {
    private Creator[] creadores = {new CreatorNumberEs(), new CreatorNumberEn(), new CreatorNumberFr()};

    private Creator creador = creadores[0];

    public void tipoCreador() {
        this.creador = (Creator) IO.getIO().select(creadores, "Elige un creador");
    }

    public void crearProducto() {
        IO.getIO().println("Creado producto: " + this.creador.createNumber(IO.getIO().readInt()).toString());
    }

    public static void main(String[] args) {
        IO.getIO().addView(new FactoryMethodMain());
    }
}
