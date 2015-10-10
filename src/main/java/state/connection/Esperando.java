package state.connection;

public class Esperando extends State {

    public Esperando() {

    }

    @Override
    public void parar(Connection connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void iniciar(Connection connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void abrir(Connection connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void recibir(Connection connection, int respuesta) {
        if (respuesta == 0) {
            connection.setState(new Cerrado());
        } else {
            connection.setState(new Preparado());
        }
    }

    @Override
    public void cerrar(Connection connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void enviar(Connection connection, String mensaje) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

}
