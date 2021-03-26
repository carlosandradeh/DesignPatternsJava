package patronesEstructurales.decorator;

/** Clase PizzaPeperoni que implementa los comportamientos de Pizza. */
public class PizzaPeperoni implements Pizza {

    @Override
    public String descripcion() {
        return "Pizza Peperoni";
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
