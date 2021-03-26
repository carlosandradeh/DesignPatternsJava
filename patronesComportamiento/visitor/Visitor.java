package patronesComportamiento.visitor;

/** Interfaz Visitor que realizará acciones en cada clase visitable. */
public interface Visitor {

    /**
     * Método que realizará una acción a un producto de linea blanca.
     * 
     * @param lineaBlanca producto de linea blanca a realizar la acción.
     * @return float
     */
    public float visit(LineaBlanca lineaBlanca);

    /**
     * Método que realizará una acción a un producto Fruta.
     * 
     * @param fruta producto Fruta a realizar la acción.
     * @return float
     */
    public float visit(Fruta fruta);
}
