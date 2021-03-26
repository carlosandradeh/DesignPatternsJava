package patronesComportamiento.chainOfResponsability;

/** Clase para hacer transacciones bancarias. */
public class Transaccion implements ITransaccion {
    private float cantidad;
    private float balance;
    private TipoTransaccion tipoTransaccion;

    /**
     * Constructor de una Transacción.
     * @param cantidad 
     * @param balance
     * @param tipoTransaccion
     */
    public Transaccion(float cantidad, float balance, TipoTransaccion tipoTransaccion) {
        this.cantidad = cantidad;
        this.balance = balance;
        this.tipoTransaccion = tipoTransaccion;
    }

    /**
     * Getter de cantidad.
     * @return float cantidad.
     */
    @Override
    public float getCantidad() {
        return cantidad;
    }

    /**
     * Setter de cantidad.
     * @param cantidad float de cantidad
     */
    @Override
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Getter del balance
     * @return float balance.
     */
    @Override
    public float getBalance() {
        return balance;
    }

    /**
     * Setter de balance.
     * @param balance float balance.
     */
    @Override   
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * Getter del tipo de transacción.
     * @return tipoTransaccion 
     */
    @Override
    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Setter de tipo de Transacción. 
     * @param tipoTransaccion tipo transacción.
     */
    @Override
    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
}
