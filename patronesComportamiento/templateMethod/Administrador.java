package patronesComportamiento.templateMethod;

/**
 * Clase Administrador que hereda de Usuario e implementa su método abtsracto
 */
public class Administrador extends Usuario {

    /**
     * Método que implementa de la clase abstracta Usuario. Define cómo va a
     * trabajar un administrador.
     */
    @Override
    public void formaTrabajar() {
        System.out.println("Forma de trabajar de un administrador.");
    }

}
