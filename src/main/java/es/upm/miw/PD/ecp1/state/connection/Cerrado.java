package es.upm.miw.PD.ecp1.state.connection;

public class Cerrado extends Estado {
    
    public Cerrado() {
        
    }
    
    @Override
    public void parar(Conexion connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void iniciar(Conexion connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(); 
    }
    
    @Override
    public void abrir(Conexion connection) {
        connection.setState(new Preparado());
    }
    
    @Override
    public void recibir(Conexion connection, int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void cerrar(Conexion connection) {
        connection.setState(this);
    }
    
    @Override
    public void enviar(Conexion connection, String mensaje) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

}
