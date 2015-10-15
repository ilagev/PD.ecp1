package state.connection;

public class Parado extends Estado {
    
    public Parado() {
        
    }
    
    @Override
    public void parar(Conexion connection) {
        connection.setState(this);
    }
    
    @Override
    public void iniciar(Conexion connection) {
        connection.setState(new Preparado());
    }
    
    @Override
    public void abrir(Conexion connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void recibir(Conexion connection, int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void cerrar(Conexion connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void enviar(Conexion connection, String mensaje) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

}
