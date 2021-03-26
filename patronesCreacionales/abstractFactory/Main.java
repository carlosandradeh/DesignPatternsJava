package patronesCreacionales.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Nuestras Abstracts Factory
        AbstarctFactory apple = new AppleStore();
        AbstarctFactory samsung = new SamsungStore();

        // Instancias según la familia de objeto de las Abstracts Factories.
        Computadora mac = apple.crearComputadora();
        Tablet ipad = apple.crearTablet();

        Computadora pcSamsung = samsung.crearComputadora();
        Tablet galaxy = samsung.crearTablet();

        // Comportamientos de nuestros objetos según las familias de Abstract Factory.
        mac.muestraQueEresComputadora();
        ipad.muestraQueEresTablet();

        pcSamsung.muestraQueEresComputadora();
        galaxy.muestraQueEresTablet();
    }
}
