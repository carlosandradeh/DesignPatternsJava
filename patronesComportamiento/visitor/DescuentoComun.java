package patronesComportamiento.visitor;

/** Clase DescuentoComun que implementa visitor */
public class DescuentoComun implements Visitor {

    /**
     * Método que define qué descuento se le hará a un objeto LineaBlanca.
     * 
     * @param lineaBlanca producto de linea blanca a aplicar el descuento.
     * @return float precio con descuento del producto de linea blanca.
     */
    @Override
    public float visit(LineaBlanca lineaBlanca) {
        return lineaBlanca.getPrecio() * 0.10f;
    }

    /**
     * Método que define qué descuento se le hará a un objeto LineaBlanca.
     * 
     * @param fruta a aplicar el descuento
     * @return float precio de la fruta con descuento.
     */
    @Override
    public float visit(Fruta fruta) {
        return fruta.getPrecio() * 0.05f;
    }

}
