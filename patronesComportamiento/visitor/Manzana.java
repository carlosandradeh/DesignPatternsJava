package patronesComportamiento.visitor;

/** Clase Manzana que es fruta. */
public class Manzana implements Fruta, Visitable {

    /** Método que regresa el precio de la Manzana */
    @Override
    public float getPrecio() {
        return 2f;
    }

    /**
     * Método que implementa de Visitable donde aplica el descuento de acuerdo a que
     * es fruta.
     * 
     * @param visitor descuento
     */
    @Override
    public float aplicarDescuento(Visitor visistor) {
        return visistor.visit(this);
    }

}
