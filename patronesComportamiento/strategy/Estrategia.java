package patronesComportamiento.strategy;

/** Interfaz que define una operación */
public interface Estrategia {
    /** Método para realizar alguna operación. */
    public float realizarOperacion(float balance, float cantidad);
}
