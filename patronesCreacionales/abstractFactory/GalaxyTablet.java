package patronesCreacionales.abstractFactory;

/** Clase GalaxyTablet que implementa los métodos de Tablet */
public class GalaxyTablet implements Tablet {

    /**
     * Método que implementa de Tablet que dice que es una tablet.
     */
    @Override
    public void muestraQueEresTablet() {
        System.out.println("¡Soy una Tablet Galaxy!");
    }
}
