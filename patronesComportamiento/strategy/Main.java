package patronesComportamiento.strategy;

public class Main {
    public static void main(String[] args) {
        // Creamos una transacción con estrategia de tipo deposito.
        Transaccion transaccion1 = new Transaccion(new Deposito());
        System.out.println(transaccion1.ejecutarTransaccion(100, 200));

        // Creamos una transacción con estrategia de tipo retiro.
        Transaccion transaccion2 = new Transaccion(new Retiro());
        System.out.println(transaccion2.ejecutarTransaccion(700, 200));
    }
}
