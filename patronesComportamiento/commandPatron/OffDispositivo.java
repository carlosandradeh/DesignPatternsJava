package patronesComportamiento.commandPatron;

/**
 * Clase que implementa el comportamiento de Command. Fungirá como un objeto
 * para realizar la operación concreta de apagar un dispositivo.
 */
public class OffDispositivo implements Command {
    // Dispositivo el cual realizará la operación.
    private Dispositivo dispositivo;

    /**
     * Construtor que inicializa el Dispositivo sobre el cual se realizará la
     * operación de apagar.
     * 
     * @param dispositivo Dispositivo sobre el cual se implementrá la operación de
     *                    apagar.
     */
    public OffDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    /**
     * Método que ejecutará en concreto la operación de apagar un dispsitivo.
     */
    @Override
    public void operacion() {
        dispositivo.off();
    }
}
