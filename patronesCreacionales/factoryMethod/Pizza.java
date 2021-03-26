package patronesCreacionales.factoryMethod;

/**
 * Clase Pizza que define comportamientos de una pizza.
 */
public class Pizza {
    // Numero de rebanadas.
    private int rebanadas;
    // Ingredientes de la pizza.
    private String especialidad;

    /**
     * Constructor de una Pizza
     * 
     * @param rebanadas    numero de rebanadas de la pizza.
     * @param especialidad especialidad de la pizza.
     */
    public Pizza(int rebanadas, String especialidad) {
        this.rebanadas = rebanadas;
        this.especialidad = especialidad;
    }

    /**
     * Método to string que define qué datos se mostrarán.
     * 
     * @return String cadena de datos a mostrar.
     */
    public String toString() {
        return "Cantidad de rebanadas: " + rebanadas + " de: " + especialidad;
    }
}