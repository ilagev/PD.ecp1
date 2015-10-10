package state.connection;

public abstract class State {
    
    public abstract void parar(Connection connection);
    
    public abstract void iniciar(Connection connection);
    
    public abstract void abrir(Connection connection);
    
    public abstract void recibir(Connection connection, int respuesta);
    
    public abstract void cerrar(Connection connection);
    
    public abstract void enviar(Connection connection, String mensaje);

}
