package es.upm.miw.PD.ecp1.state.connection;

public class Preparado extends Estado {
    
    public Preparado() {
        
    }
    
    @Override
    public void parar(Conexion connection) {
        connection.setState(new Parado());
    }
    
    @Override
    public void iniciar(Conexion connection) {
        connection.setState(this);
    }
    
    @Override
    public void abrir(Conexion connection) {
        connection.setState(this);
    }
    
    @Override
    public void recibir(Conexion connection, int respuesta) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void cerrar(Conexion connection) {
        connection.setState(new Cerrado());
    }
    
    @Override
    public void enviar(Conexion connection, String mensaje)  {
        connection.getLink().enviar(mensaje);
        connection.setState(new Esperando());
    }

}
