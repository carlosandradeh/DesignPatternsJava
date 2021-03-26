package patronesComportamiento.mediator;

public class Main {
    public static void main(String[] args) {
        // Creamos nuevos Usuarios
        UsuarioChat carlos = new Usuario("Carlos");
        UsuarioChat zuky = new Usuario("Zuky");

        // Creamos un mediador para enviarse mensajes "Sala de chat".
        SalaChat salaChat = new SalaChat();
        salaChat.addParticipante(carlos);
        salaChat.addParticipante(zuky);

        // Los usuarios se envían mensajes.
        String mensajeDeCarlos = "Hola " + zuky.getNombre() + "!!";
        salaChat.enviarMensaje(carlos, zuky, mensajeDeCarlos);

        String mensajeDeZuky = "Hola " + zuky.getNombre() + "!!";
        salaChat.enviarMensaje(zuky, carlos, mensajeDeZuky);
    }
}
