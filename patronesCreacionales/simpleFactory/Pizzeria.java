package patronesCreacionales.simpleFactory;

/**
 * Clase Simple Factory Pizzeria. Controla como serán las instancias de Pizza.
 */
public class Pizzeria {

    /**
     * Método que crea una instancia de Pizza en modo chica.
     * 
     * @return Pizza chica.
     */
    public Pizza crearPizzaChica() {
        return new Pizza(6);
    }

    /**
     * Método que crea una instancia de Pizza en modo mediana.
     * 
     * @return Pizza mediana.
     */
    public Pizza crearPizzaMediana() {
        return new Pizza(8);
    }

    /**
     * Método que crea una instancia de Pizza en modo grande.
     * 
     * @return Pizza grande.
     */
    public Pizza crearPizzaGrande() {
        return new Pizza(12);
    }
}
