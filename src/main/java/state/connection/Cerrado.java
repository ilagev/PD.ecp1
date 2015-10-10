package state.connection;

public class Cerrado extends State {
    
    public Cerrado() {
        
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
    public void abrir(Connection connection) {
        connection.setState(new Preparado());
    }
    
    @Override
    public void recibir(Connection connection, int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void cerrar(Connection connection) {
        connection.setState(this);
    }
    
    @Override
    public void enviar(Connection connection, String mensaje) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

}
