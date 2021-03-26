package patronesComportamiento.strategy;

/**
 * Clase Transacción que realizará operaciones deacuerdo a la estrategia dada.
 */
public class Transaccion {
    // Estrategia a realizar
    private Estrategia estrategia;

    /**
     * Constructor de una Transacción.
     * 
     * @param estrategia Estrategia a realizar.
     */
    public Transaccion(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * Método que ejecuta una transacción operación deacuerdo a la estrategia del
     * objeto.
     * 
     * @param balance  balance de la transacción.
     * @param cantidad cantidad de la transacción.
     * @return
     */
    public float ejecutarTransaccion(float balance, float cantidad) {
        return estrategia.realizarOperacion(balance, cantidad);
    }
}
