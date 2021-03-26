package patronesCreacionales.factoryMethod;

/**
 * Clase Pizzeria. Controla como serán las instancias de Pizza.
 */
public class PizzeriaCarlos implements Pizzeria {

    /**
     * Método para controlar como crear una pizza
     * 
     * @param especialidad Ingredientes de la pizza a crear.
     * @return Pizza instancia de una pizza.
     */
    @Override
    public Pizza crearPizza(String especialidad) {
        if (especialidad.equals("Peperoni"))
            return new Pizza(6, "Peperoni");

        if (especialidad.equals("Hawaiana"))
            return new Pizza(8, "Hawaiana");

        if (especialidad.equals("Peperoni orilla rellena"))
            return new PizzaOrillaRellena(12, "Peperoni orilla rellena");

        return null;
    }
}
