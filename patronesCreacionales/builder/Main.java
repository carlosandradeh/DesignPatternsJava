package patronesCreacionales.builder;

public class Main {
    public static void main(String[] args) {
        String nombre = "Zuky";
        String apellido = "Andrade";
        String email = "zuky@zukycorreo.com";
        String telefono = "5576701966";
        String direccion = "Av del Taller";

        // Construimos un nuevo objeto Usuario con el patrón de diseño Builder.
        Usuario zuky = Usuario.Make(nombre, apellido).setEmail(email).setTelefono(telefono).setDireccion(direccion)
                .Build();

        System.out.println(zuky);
    }
}
