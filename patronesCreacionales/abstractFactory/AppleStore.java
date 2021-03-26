package patronesCreacionales.abstractFactory;

/**
 * Clase AppleStore que va a ser una "Fabrica" y va a implementar todos los métodos
 * de la Abstract Factory.
 */
public class AppleStore implements AbstarctFactory {

    /**
     * Método que implementa de AbstractFactory.
     * Regresa una instancia de una Computadora
     * 
     * @return Computadora MacBoock pro.
     */
    @Override
    public Computadora crearComputadora() {
        return new Macbook();
    }

    /**
     * Método que implementa de AbstractFactory.
     * Regresa una instancia de una Tablet.
     * 
     * @return Tablet Ipad.
     */
    @Override
    public Tablet crearTablet() {
        return new Ipad();
    }
}
