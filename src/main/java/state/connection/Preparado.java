package state.connection;

public class Preparado extends State {
    
    public Preparado() {
        
    }
    
    @Override
    public void parar(Connection connection) {
        connection.setState(new Parado());
    }
    
    @Override
    public void iniciar(Connection connection) {
        connection.setState(this);
    }
    
    @Override
    public void abrir(Connection connection) {
        connection.setState(this);
    }
    
    @Override
    public void recibir(Connection connection, int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void cerrar(Connection connection) {
        connection.setState(new Cerrado());
    }
    
    @Override
    public void enviar(Connection connection, String mensaje)  {
        connection.setState(new Esperando());
    }

}
