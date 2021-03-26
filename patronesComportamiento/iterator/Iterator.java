package patronesComportamiento.iterator;

/** Interfaz Iterator que define los métodos de un Iterador. */
public interface Iterator {
    /**
     * Nos da el siguiente elemento de la colección y se mueve a la siguiente
     * posición.
     * 
     * @return String siguiente
     */
    public String next();

    /**
     * Nos dice si hay un elemento siguiente en la colección.
     * 
     * @return boolean.
     */
    public boolean hasNext();
}
