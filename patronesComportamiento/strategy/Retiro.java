package patronesComportamiento.strategy;

/** Clase Retiro que simulará una transacción de tipo retiro. */
public class Retiro implements Estrategia {

    /**
     * Método que realizará la operación de un retiro.
     */
    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance - cantidad;
    }
    
}
