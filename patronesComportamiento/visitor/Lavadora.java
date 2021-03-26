package patronesComportamiento.visitor;

/** Clase Lavadora que es Linea Blanca */
public class Lavadora implements LineaBlanca, Visitable {

    /** Método que regresa el precio de la lavadora */
    @Override
    public float getPrecio() {
        return 20f;
    }

    /**
     * Método que aplica un descuento de acuerdo al visitor, si es Linea Blanca o
     * no.
     * 
     * @param visitor descuento
     */
    @Override
    public float aplicarDescuento(Visitor visistor) {
        return visistor.visit(this);
    }

}
