package patronesCreacionales.simpleFactory;

/**
 * Clase Pizza que define comportamientos de una pizza.
 */
public class Pizza {
    // Numero de rebanadas
    private int rebanadas;

    /**
     * Constructor de una Pizza
     * 
     * @param rebanadas numero de rebanadas de la pizza.
     */
    public Pizza(int rebanadas) {
        this.rebanadas = rebanadas;
    }

    /**
     * Método to string que define qué datos se mostrarán.
     * 
     * @return String cadena de datos a mostrar.
     */
    public String toString() {
        return "Cantidad de rebanadas: " + rebanadas;
    }
}