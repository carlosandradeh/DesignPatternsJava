package patronesEstructurales.decorator;

public class OrillaRellena implements Pizza {

    // Atributo Pizza que nos ayuda en la implementación de Decorator.
    private Pizza pizza;

    /**
     * Construcor de una Pizza con Orilla rellena.
     * 
     * @param pizza Pizza en la cual se le aplicará el queso extra.
     */
    public OrillaRellena(Pizza pizza) {
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
        return pizza.descripcion() + " con orilla rellena";
    }

    /**
     * Método que implementa precio() de Pizza, y con base en la pizza del atributo
     * agrega comportamiento extra (pizza.precio() + 4).
     * 
     * @return int precio.
     */
    @Override
    public int precio() {
        return pizza.precio() + 4;
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
