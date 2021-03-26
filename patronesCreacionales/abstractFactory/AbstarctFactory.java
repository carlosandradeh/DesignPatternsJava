package patronesCreacionales.abstractFactory;

/** Interfaz que define los n métodos que hará la "Fabrica" */
public interface AbstarctFactory {
    // Método para crear una computadora.
    public Computadora crearComputadora();

    // Método para crear una tablet.
    public Tablet crearTablet();
}
