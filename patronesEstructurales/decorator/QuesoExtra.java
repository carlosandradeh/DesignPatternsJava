package patronesEstructurales.decorator;

/**
 * Clase que QuesoExtra implementa los métodos de Pizza e implementa el Patrón
 * de Diseño Decorator.
 */
public class QuesoExtra implements Pizza {

    // Atributo Pizza que nos ayuda en la implementación de Decorator.
    private Pizza pizza;

    /**
     * Construcor de una Pizza con QuesoExtra.
     * 
     * @param pizza Pizza en la cual se le aplicará el queso extra.
     */
    public QuesoExtra(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Método que implementa de Pizza, y con base en la pizza del atributo agrega
     * comportamiento extra.
     * 
     * @return String descripción.
     */
    @Override
    public String descripcion() {
        return pizza.descripcion() + " con queso extra";
    }

    /**
     * Método que implementa precio() de Pizza, y con base en la pizza del atributo
     * agrega comportamiento extra (pizza.precio() + 2).
     * 
     * @return int precio.
     */
    @Override
    public int precio() {
        return pizza.precio() + 2;
    }

    /**
     * Método que implementa de Pizza, y con base en la pizza del atributo agrega
     * comportamiento extra.
     * 
     * @return String .
     */
    @Override
    public String toString() {
        return "Descripción: " + descripcion() + " Precio: " + precio();
    }

}
