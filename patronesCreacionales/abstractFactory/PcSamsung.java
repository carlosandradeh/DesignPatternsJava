package patronesCreacionales.abstractFactory;

/** Clase PcSamsung que implementa los comportamientos de Computadora */
public class PcSamsung implements Computadora{
    
    /** Método implementado de Computadora que dice que es una computadora. */
    @Override
    public void muestraQueEresComputadora() {
        System.out.println("¡Soy una computadora De Samsung!");

    }
}
