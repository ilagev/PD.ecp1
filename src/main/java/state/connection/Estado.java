package state.connection;

public abstract class Estado {
    
    public static final Cerrado CERRADO = new Cerrado();
    public static final Esperando ESPERANDO = new Esperando();
    public static final Parado PARADO = new Parado();
    public static final Preparado PREPARADO = new Preparado();
    
    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }
    
    public abstract void parar(Conexion connection);
    
    public abstract void iniciar(Conexion connection);
    
    public abstract void abrir(Conexion connection);
    
    public abstract void recibir(Conexion connection, int respuesta);
    
    public abstract void cerrar(Conexion connection);
    
    public abstract void enviar(Conexion connection, String mensaje);

}
