package state.connection;

public class Parado extends State {
    
    public Parado() {
        
    }
    
    @Override
    public void parar(Connection connection) {
        connection.setState(this);
    }
    
    @Override
    public void iniciar(Connection connection) {
        connection.setState(new Preparado());
    }
    
    @Override
    public void abrir(Connection connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void recibir(Connection connection, int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
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
