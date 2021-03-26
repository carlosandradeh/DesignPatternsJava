package patronesComportamiento.visitor;

/** Interfaz Visitable que define el comportamiento de un Objeto visitable. */
public interface Visitable {
    /**
     * Método que aplica el descuento deacuerdo al visitor.
     * @param visistor visitor que realizará el descuento.
     * @return float precio con descuento.
     */
    public float aplicarDescuento(Visitor visistor);
}
