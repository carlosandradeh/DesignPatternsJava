package patronesComportamiento.chainOfResponsability;

/** Clase Retiro que implementa el comportamiento del ManejadorTrnsacciones */
public class Retiro implements IManejadorTransacciones {
    // Next para encadenar transacciones.
    private IManejadorTransacciones next;

    /**
     * Método para pasar a la siguiente transacción.
     * 
     * @param IManejadorTransacciones next.
     */
    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    /**
     * Método que ejecuta una Transacción
     * 
     * @param ITransaccion transacción que se quiere ejecutar.
     */
    @Override
    public void ejecutarTransaccion(ITransaccion transaccion) {
        if (transaccion.getTipoTransaccion() == TipoTransaccion.Retiro) {
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance después de un retiro es: " + cantidad);
        } else {
            next.ejecutarTransaccion(transaccion);
        }
    }

}
