package patronesCreacionales.abstractFactory;

/** Clase Macbook que implementa los comportamientos de Computadora */
public class Macbook implements Computadora {

    /** Método implementado de Computadora que dice que es una computadora. */
    @Override
    public void muestraQueEresComputadora() {
        System.out.println("¡Soy una computadora Macbook!");

    }

}
