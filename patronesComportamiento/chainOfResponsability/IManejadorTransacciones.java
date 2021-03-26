package patronesComportamiento.chainOfResponsability;

/** Interfaz que define el comportamiento de una manejdaor de transacciones */
public interface IManejadorTransacciones {

    // Vamos a poder encadenar Manejadores
    public void setNextManejador(IManejadorTransacciones next);

    // Ejecuta la transacción.
    public void ejecutarTransaccion(ITransaccion transaccion);
}
