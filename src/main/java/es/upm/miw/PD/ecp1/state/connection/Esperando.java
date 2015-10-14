package es.upm.miw.PD.ecp1.state.connection;

public class Esperando extends Estado {
    
    public Esperando() {

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
    public void abrir(Conexion connection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void recibir(Conexion connection, int respuesta) {
        if (respuesta == 0) {
            connection.setState(new Preparado());
        } else {
            connection.setState(new Cerrado());
        }
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
