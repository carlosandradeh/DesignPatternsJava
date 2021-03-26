package patronesComportamiento.mediator;

/**
 * Interfaz que define el comportamiento de un Usuario participante en una sala
 * de Chat.
 */
public interface UsuarioChat {
    /** Método para conseguir el nombre del usuario.
     * 
     * @return String nombre del usuario.
     */
    public String getNombre();

    /** Método para recibir un mensaje */
    public void recibirMensaje(String mensaje);
}
