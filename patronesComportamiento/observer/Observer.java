package patronesComportamiento.observer;

/**
 * Interfaz Observer que le interesa en los objetos que queremos que sean
 * observadores.
 */
public interface Observer {
    /** Método que notifica a un observador. */
    public void notificacion(String mensaje);
}
