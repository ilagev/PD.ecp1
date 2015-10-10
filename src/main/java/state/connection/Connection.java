package state.connection;

public class Connection {
    private State state;
    
    public Connection() {
        state = new Cerrado();
    }
    
    public void parar() {
        state.parar(this);
    }
    
    public void iniciar() {
        state.iniciar(this);
    }

    public void abrir() {
        state.abrir(this);
    }
    
    public void recibir(int respuesta) {
        state.recibir(this, respuesta);
    }
    
    public void cerrar() {
        state.cerrar(this);
    }
    
    public void enviar(String mensaje) {
        state.enviar(this, mensaje);
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
}
