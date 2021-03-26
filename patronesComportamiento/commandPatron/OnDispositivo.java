package patronesComportamiento.commandPatron;

/**
 * Clase que implementa el comportamiento de Command. Fungirá como un objeto
 * para realizar la operación concreta de prender un dispositivo.
 */
public class OnDispositivo implements Command {
    // Dispositivo el cual realizará la operación.
    private Dispositivo dispositivo;

    /**
     * Construtor que inicializa el Dispositivo sobre el cual se realizará la
     * operación de prender.
     * 
     * @param dispositivo Dispositivo sobre el cual se implementrá la operación de
     *                    prender.
     */
    public OnDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    /**
     * Método que ejecutará en concreto la operación de prender un dispsitivo.
     */
    @Override
    public void operacion() {
        dispositivo.on();
    }

}
