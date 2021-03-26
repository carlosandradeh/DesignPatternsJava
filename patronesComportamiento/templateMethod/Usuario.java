package patronesComportamiento.templateMethod;

/** Clase Abstracta Usuario */
public abstract class Usuario {

    /** Método para la autenticación de todos los usuarios */
    public void autenticacion() {
        System.out.println("Todos los usuarios necesitan autenticarse!");
    }

    /**
     * Método abstracto que va a definir cuál es la forma de trabajar de un Usuario.
     */
    public abstract void formaTrabajar();

}
