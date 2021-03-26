package patronesComportamiento.strategy;

/** Clase Deposito que simulará una transacción de tipo deposito. */
public class Deposito implements Estrategia {

    /**
     * Método que realizará la operación de un deposito.
     */
    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance + cantidad;
    }
    
}
