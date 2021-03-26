package patronesComportamiento.memento;

public class Main {
    public static void main(String[] args) {
        // Creamos un usuario.
        Usuario usuario = new Usuario("Carlos", 20);

        // Creamos un memento a partir de usuario.
        Usuario memento = usuario.getMemento();

        // Modificamos los atributos del usuario.
        usuario.setNombre("Alberto");
        usuario.setEdad(21);

        System.out.println("Nombre: " + usuario.getNombre() + " Edad: " + usuario.getEdad());

        // Restauramos el usuario a partir del memento.
        usuario.restauraMemento(memento);

        System.out.println("Nombre: " + usuario.getNombre() + " Edad: " + usuario.getEdad());

    }
}
