package patronesCreacionales.factoryMethod;

/**
 * Interfaz que define el comportamiento de una pizzeria.
 */
public interface Pizzeria {
    public Pizza crearPizza(String especialidad);
}
