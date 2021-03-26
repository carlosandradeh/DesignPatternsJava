package patronesComportamiento.mediator;

import java.util.HashMap;

/** Clase SalaChat que funcionará como mediator. */
public class SalaChat {
    // Mapa de usuarios participantes en la sala de chat.
    private HashMap<String, UsuarioChat> usuarios;

    /**
     * Constructor de la sala de chat.
     */
    public SalaChat() {
        usuarios = new HashMap<String, UsuarioChat>();
    }

    /**
     * Método para agregar nuevos participantes de la sala de chat.
     * @param usuario usuario a agregar a la sala de chat.
     */
    public void addParticipante(UsuarioChat usuario) {
        usuarios.put(usuario.getNombre(), usuario);
    }

    /**
     * Método para enviar mensaje entre dos usuarios.
     * @param remitente Usuario que envía el mensaje.
     * @param receptor Usuario que recibe el mensaje.
     * @param mensaje mensaje.
     */
    public void enviarMensaje(UsuarioChat remitente, UsuarioChat receptor, String mensaje) {
        if (usuarios.get(remitente.getNombre()) != null && usuarios.get(receptor.getNombre()) != null) {
            mensaje = "De: " + remitente.getNombre() + " Mensaje: " + mensaje;
            receptor.recibirMensaje(mensaje);
        }
    }
}
