package patronesComportamiento.chainOfResponsability;

/** Interfaz que define el comportamiento de una Transacción */
public interface ITransaccion {
    
    public float getCantidad();

    public void setCantidad(float cantidad);

    public float getBalance();

    public void setBalance(float balance);

    public TipoTransaccion getTipoTransaccion();

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion);
}
