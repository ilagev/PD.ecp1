package es.upm.miw.PD.ecp1.state.connection;

public class Conexion {
    private Estado state;
    private Link link;
    
    public Conexion() {
        state = new Cerrado();
    }
    
    public Conexion(Link link) {
        this();
        this.link = link;
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
    
    public void setState(Estado state) {
        this.state = state;
    }
    
    public Estado getEstado() {
        return state;
    }
    
    public Link getLink() {
        return link;
    }
    
}
