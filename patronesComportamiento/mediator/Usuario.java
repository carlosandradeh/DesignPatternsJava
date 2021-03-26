package patronesComportamiento.mediator;

/**
 * Clase que define a un Usuario, implementa el comportamiento de un Usuario
 * participante en una sala de chat.
 */
public class Usuario implements UsuarioChat {
    // Nombre del usuario.
    private String nombre;

    /**
     * Constructor del usuario.
     * 
     * @param nombre nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter del nombre del usuario.
     * 
     * @return String nombre del usuario.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que implementa de UsuarioChat que hace que reciba un mensaje.
     * 
     * @param String mensaje.
     */
    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
