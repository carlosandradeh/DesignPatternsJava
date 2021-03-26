package patronesCreacionales.abstractFactory;

/**
 * Clase SamsungStore que va a ser una "Fabrica" y va a implementar todos los métodos
 * de la Abstract Factory.
 */
public class SamsungStore implements AbstarctFactory {

    /**
     * Método que implementa de AbstractFactory.
     * Regresa una instancia de una Computadora
     * 
     * @return Computadora PcSamsung.
     */
    @Override
    public Computadora crearComputadora() {
        return new PcSamsung();
    }

    /**
     * Método que implementa de AbstractFactory.
     * Regresa una instancia de una Tablet.
     * 
     * @return Tablet Galaxy .
     */
    @Override
    public Tablet crearTablet() {
        return new GalaxyTablet();
    }
    
}
