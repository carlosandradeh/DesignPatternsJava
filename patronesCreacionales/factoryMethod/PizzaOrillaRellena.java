package patronesCreacionales.factoryMethod;

/** Clase para crear pizzas orillas rellenas */
public class PizzaOrillaRellena extends Pizza {

    /**
     * Constructor para iniciliazar los atributos de la pizza.
     * 
     * @param rebanadas    Numero de rebanadas.
     * @param especialidad Ingredientes de la pizza.
     */
    public PizzaOrillaRellena(int rebanadas, String especialidad) {
        super(rebanadas, especialidad);
    }

    /**
     * Método para decir que tiene queso la orilla.
     */
    public void orillaRellena() {
        System.out.println("Esta pizza tiene orilla rellena");
    }
}
