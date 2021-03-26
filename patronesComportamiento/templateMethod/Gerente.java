package patronesComportamiento.templateMethod;

/** Clase Gerente que hereda de Usuario */
public class Gerente extends Usuario {

    /**
     * Método que implementa de la clase abstracta Usuario. Define cómo va a
     * trabajar un gerente.
     */
    @Override
    public void formaTrabajar() {
        System.out.println("Forma de trabajar de un gerente!");
    }

}
