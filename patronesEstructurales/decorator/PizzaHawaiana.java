package patronesEstructurales.decorator;

/** Clase PizzaHawaiana que implementa los métodos de una Pizza. */
public class PizzaHawaiana implements Pizza {

    @Override
    public String descripcion() {
        return "Pizza Hawaiana";
    }

    @Override
    public int precio() {
        return 8;
    }

    @Override
    public String toString() {
        return "Descripción: " + descripcion() + " Precio: " + precio();
    }
}
