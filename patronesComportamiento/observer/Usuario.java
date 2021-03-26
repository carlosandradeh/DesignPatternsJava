package patronesComportamiento.observer;

/** Clase Usuario que será un observador */
public class Usuario implements Observer {

    /**
     * Método que implementa de Observer que notifica a este con un mensaje.
     */
    @Override
    public void notificacion(String mensaje) {
        System.out.println(mensaje);
    }

}
