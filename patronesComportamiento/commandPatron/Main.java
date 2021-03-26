package patronesComportamiento.commandPatron;

public class Main {
    public static void main(String[] args) {
        // Objeto sobre el cual se obtendrán las operaciones.
        Television television = new Television();

        // Cada operación tendrá su propio objeto.
        Command televisionOn = new OnDispositivo(television);
        Command televisionOff = new OffDispositivo(television);

        // Operaciones
        televisionOn.operacion();
        televisionOff.operacion();
    }
}
