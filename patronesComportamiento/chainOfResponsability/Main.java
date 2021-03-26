package patronesComportamiento.chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Deposito);

        IManejadorTransacciones deposito = new Deposito();
        IManejadorTransacciones retiro = new Retiro();
        IManejadorTransacciones reembolso = new Reembolso();

        deposito.setNextManejador(retiro);
        retiro.setNextManejador(reembolso);

        deposito.ejecutarTransaccion(transaccion);
    }
}
