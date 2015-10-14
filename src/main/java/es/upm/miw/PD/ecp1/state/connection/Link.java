package es.upm.miw.PD.ecp1.state.connection;

public interface Link {

    static final int ACK = 0;

    void enviar(String msg);

    void recibir(int respuesta);

}
